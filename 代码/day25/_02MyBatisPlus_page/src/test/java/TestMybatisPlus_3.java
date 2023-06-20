import com.MybatisPlusApplication_page;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
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
public class TestMybatisPlus_3 {

    @Autowired
    private EmpDao empDao;

    @Test
    public void testFindALl(){
        QueryWrapper queryWrapper = new QueryWrapper();
        List<Emp> empList =    empDao.selectList(queryWrapper);
        System.out.println(empList);
    }



}
