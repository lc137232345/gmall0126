package com.atguigu.gmall.user;



import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.UmsMember;
import com.atguigu.gmall.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.service.UmsMemberReceiveAddressService;
import com.atguigu.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class UserController {

    @Reference
    private UserService userService;

    @Reference
    private UmsMemberReceiveAddressService umsMemberReceiveAddressService;


    @RequestMapping("index")
    @ResponseBody
    public List<UmsMember> test() {
        return userService.selectAll();
    }

    @RequestMapping("selectById")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getUmsMemberReceiveAddressMemberId(String memberId) {
        List<UmsMemberReceiveAddress> umsMemberReceiveAddressMemberId = umsMemberReceiveAddressService.getUmsMemberReceiveAddressMemberId(memberId);
        return umsMemberReceiveAddressMemberId;
    }

}
