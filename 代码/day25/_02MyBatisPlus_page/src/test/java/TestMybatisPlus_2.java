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

//@SpringBootTest  //思考?
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {MybatisPlusApplication_page.class})
public class TestMybatisPlus_2 {

    @Autowired
    private EmpDao empDao;

    @Test
    public void testFindALl(){
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.select("name","entrytime");
        List<Emp> empList =    empDao.selectList(queryWrapper);
        System.out.println(empList);
        //VO --->投影

    }

    @Test
    public void testFindALl2(){
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.select("count(*) as count,sex");//别名加字段
        queryWrapper.groupBy("sex");
        List<Emp> empList =    empDao.selectList(queryWrapper);
        System.out.println(empList);
        //VO --->投影

    }

    @Test
    public void testFindALl3(){
        LambdaQueryWrapper<Emp> lqw = new LambdaQueryWrapper();
        lqw.likeLeft(Emp::getName,"王");
        List<Emp> empList =    empDao.selectList(lqw);
        System.out.println(empList);
    }


}
