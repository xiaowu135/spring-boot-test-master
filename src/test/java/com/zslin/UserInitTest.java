package com.zslin;

import com.zslin.model.User;
import com.zslin.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 
 * @author Administrator
 *
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserInitTest {

    @Autowired
    private IUserService userService;

    @Test
    public void initTest() {
        for(int i=1; i<=10; i++) {
            User u = new User();
            u.setEmail("email"+i+"@domain.com");
            u.setPassword("pwd"+i);
            u.setUserName("user"+i);
            u.setNickName("nickname"+i);
            userService.save(u);
        }
    }
}
