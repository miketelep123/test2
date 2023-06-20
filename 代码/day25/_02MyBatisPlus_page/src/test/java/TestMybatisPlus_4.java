import com.MybatisPlusApplication_page;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dao.EmpDao;
import com.pojo.Emp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

//@SpringBootTest  //思考?
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {MybatisPlusApplication_page.class})
public class TestMybatisPlus_4 {

    @Autowired
    private EmpDao empDao;

    @Test
    public void testFindALl(){
        //多选框
        List<Integer> ids = new ArrayList<>();
        ids.add(1);
        ids.add(2);
        ids.add(3);
       empDao.deleteBatchIds(ids);
    }



}
