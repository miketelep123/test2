import com.MybatisPlusApplication_page;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.dao.EmpDao;
import com.pojo.Emp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {MybatisPlusApplication_page.class})
public class TestMybatis_tiaojian {

    @Autowired
    private EmpDao empDao;

    @Test
    public void testFindALl() {
        QueryWrapper<Emp> queryWrapper = new QueryWrapper<Emp>();
        queryWrapper.lt("id",10);
//        if(name!=null){
//            queryWrapper.like("name","小");
//        }
        queryWrapper.like("name","小");
        List<Emp> empList =empDao.selectList(queryWrapper);
        System.out.println(empList);
    }
    @Test
    public void test2(){
        QueryWrapper<Emp> queryWrapper=new QueryWrapper<Emp>();
        queryWrapper.lambda().gt(Emp::getId,2).lt(Emp::getId,4);
        List<Emp> empList=empDao.selectList(queryWrapper);
        System.out.println(empList);
     }


    @Test
    public void testFindALl2() {
        QueryWrapper<Emp> queryWrapper = new QueryWrapper<Emp>();
//        Emp emp  = new Emp();
//        emp.getId();  复习
        queryWrapper.lambda().lt(Emp::getId, 10);
        List<Emp> empList =empDao.selectList(queryWrapper);
        System.out.println(empList);
    }

    @Test
    public void testFindALl3() {
        LambdaQueryWrapper<Emp> lambdaQueryWrapper = new LambdaQueryWrapper();
        lambdaQueryWrapper.lt(Emp::getId, 10);
        List<Emp> empList =empDao.selectList(lambdaQueryWrapper);
        System.out.println(empList);
    }

    @Test
    public void testFindALl4() {
        // id 在 0到10之间  and
        LambdaQueryWrapper<Emp> lambdaQueryWrapper = new LambdaQueryWrapper();
        lambdaQueryWrapper.lt(Emp::getId,10).gt(Emp::getId,0);
        List<Emp> empList =empDao.selectList(lambdaQueryWrapper);
        System.out.println(empList);
    }

    @Test
    public void testFindALl5() {
        // id 小于10 或者 name="zz"
        LambdaQueryWrapper<Emp> lambdaQueryWrapper = new LambdaQueryWrapper();
        lambdaQueryWrapper.lt(Emp::getId, 10).or().eq(Emp::getName,"zzz");
        List<Emp> empList =empDao.selectList(lambdaQueryWrapper);
        System.out.println(empList);

    }

    @Test
    public void testFindALl6() {
        // id 小于10 或者 name="zz"
        LambdaQueryWrapper<Emp> lqw = new LambdaQueryWrapper();
        String name ="aaa"; //页面传递过来的
        Integer id  = 11;//页面传递过来的
        if(name!=null){
            lqw.eq(Emp::getName,name);
        }
        if(id!=null){
          lqw.lt(Emp::getId,name);
        }
    }
}
