package com.wzres;

import com.wzres.domain.User;
import com.wzres.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @ClassName MPTest
 * @date 2023-08-18 17:08
 */

@SpringBootTest
public class MPTest {

    @Autowired
    private UserMapper userMapper;

    //测试MybatisPlus环境
    @Test
    public void testUserMapper(){
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }

}
