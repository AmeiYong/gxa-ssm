import com.gxa.mapper.AdminMapper;
import com.gxa.pojo.Admin;
import org.apache.ibatis.annotations.Param;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Timestamp;
import java.util.List;

/**
 * @author:IT-CNLM
 * @date:Created at 2020/08/12
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-dao-config.xml")
public class MybatisTest {


    @Autowired
    private AdminMapper adminMapper;


    @Test
    public void test01(){
        List<Admin> all = adminMapper.findAll();
        System.out.println(all);
    }

 @Test
    public  void test02(){
     Admin admin = new Admin();
     admin.setName("admin");
     admin.setUpdateTime(new Timestamp(System.currentTimeMillis()));
     admin.setId(1L);
     adminMapper.update(admin);
 }






}
