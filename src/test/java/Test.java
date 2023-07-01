import com.lee.entity.User;
import com.lee.mapper.UserMapper;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Test {

    private UserMapper userMapper;

    @org.junit.jupiter.api.Test
    public void test(){

        User user =  userMapper.selectById(1);
        System.out.println(user);
    }

}
