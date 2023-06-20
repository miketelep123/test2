package com;

import com.dao.EmpDao;
import com.pojo.Emp;
//import org.junit.jupiter.api.Test;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

//@SpringBootTest  //思考?
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {MybatisPlusApplication_hello.class})
public class TestMybatisPlus {

    @Autowired
    private EmpDao empDao;

    @Test
    public void testFindALl(){
       List<Emp> empList =    empDao.selectList(null);
        System.out.println(empList);
    }

    @Test
    public void testAdd(){
         Emp emp = new Emp();
         emp.setId(1111);
         emp.setName("aaaa");
         empDao.insert(emp);
    }

    @Test
    public void testUpdate(){
        Emp emp = new Emp();
        emp.setId(1111);
        emp.setName("bbb");
        emp.setDescription("hello");
        empDao.updateById(emp);
    }

    @Test
    public void testDelete(){
          empDao.deleteById(1111);
    }

    @Test
    public void testFindByID(){
        Emp emp = empDao.selectById(1111);
        System.out.println(emp);
    }

}
