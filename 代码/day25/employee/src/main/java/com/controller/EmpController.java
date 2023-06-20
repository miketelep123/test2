package com.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dao.EmpDao;
import com.entity.Emp;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.DecimalMin;
import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmpController {
    @Autowired
    //private EmpService empService;//算了不写了
    private EmpDao empDao;

    @GetMapping("/findAll")
    public List<Emp> findAll(){
        List<Emp> empList=empDao.selectList(null);
        return empList;
    }

    @GetMapping("/findById/{id}")
    public Emp findById(@PathVariable Integer id){
        Emp emp=empDao.selectById(id);
        return emp;
    }

    @GetMapping("/findByName/{name}")
    public List<Emp> findByName(@PathVariable String name){
        LambdaQueryWrapper<Emp> lqw=new LambdaQueryWrapper<>();
        lqw.like(Emp::getName,name);
        List<Emp> emp=empDao.selectList(lqw);
        return emp;
    }

    @PostMapping("/add")
    public void add(@RequestBody Emp emp){
        empDao.insert(emp);
    }

    @PutMapping("/update/{id}")
    public void update(@RequestBody Emp emp){
        empDao.updateById(emp);
    }

   @DeleteMapping("/deleteById/{id}")
    public void delete(@PathVariable Integer id){
        empDao.deleteById(id);
    }


    /**
     * 分页查询
     * @return
     */
    @GetMapping("/findAll/{page}/{size}")
    public IPage<Emp> findAllPage(@PathVariable Integer page,@PathVariable Integer size){
        IPage<Emp> pageInfo=new Page<>(page,size);
        System.out.println(empDao.selectPage(pageInfo, null));
        return empDao.selectPage(pageInfo, null);
    }

}
