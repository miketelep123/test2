import com.MybatisPlusApplication_page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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
@SpringBootTest(classes = {MybatisPlusApplication_page.class})
public class TestMybatisPlus {

    @Autowired
    private EmpDao empDao;

    @Test
    public void testFindALl(){
//       List<Emp> empList =    empDao.selectList(null);
//        System.out.println(empList);
        IPage<Emp> page = new Page<>(1,2);
        empDao.selectPage(page,null);
        System.out.println("当前页"+page.getCurrent());
        System.out.println("每页"+page.getSize());
        System.out.println("总页数"+page.getPages());
        System.out.println("总条数"+page.getTotal());
        System.out.println("当前数据"+page.getRecords()); //for
    }


}
