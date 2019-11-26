package com.atgui.gmall.user.service.Impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atgui.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.atguigu.gmall.bean.UmsMemberReceiveAddress;
import com.atguigu.gmall.service.UmsMemberReceiveAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.List;


@Service
public class UmsMemberReceiveAddressServiceImpl implements UmsMemberReceiveAddressService {

    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;


    public List<UmsMemberReceiveAddress> getUmsMemberReceiveAddressMemberId(String memberId) {
        Example e = new Example(UmsMemberReceiveAddress.class);
        e.createCriteria().andEqualTo("memberId", memberId);

        return umsMemberReceiveAddressMapper.selectByExample(e);


    }
}
