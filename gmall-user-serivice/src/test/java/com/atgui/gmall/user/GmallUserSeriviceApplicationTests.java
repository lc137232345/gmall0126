package com.atgui.gmall.user;

import com.GmallUserSeriviceApplication;
import com.atgui.gmall.user.mapper.UserMapper;
import com.atguigu.gmall.bean.UmsMember;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest(classes = GmallUserSeriviceApplication.class)
@RunWith(SpringRunner.class)
public class GmallUserSeriviceApplicationTests {

/*    @Autowired
    UserService userService;*/
    @Autowired
    UserMapper userMapper;

/*    @Test
    public void contextLoads() {
        List<UmsMember> umsMembers = userService.selectAll();
        System.out.println(umsMembers);
    }*/
    @Test
    public void contextLoads() {

        List<UmsMember> umsMembers = userMapper.selectAll();

        System.out.println(umsMembers);
        System.out.println(123);
    }

}
