import com.bjsxt.mapper.UsersMapper;
import com.bjsxt.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/spring/applicationContext-dao.xml")
public class ManagerTest {

    @Autowired
    private UsersMapper usersMapper;

    @Test
    public void insertUserTest(){

        Users users = new Users();
        users.setUsername("zhangsan2");
        users.setUserage(19);

        this.usersMapper.insertUser(users);
    }

}
