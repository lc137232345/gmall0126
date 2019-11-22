package com.atguigu.gmall.manage.service;


import com.atguigu.gmall.bean.PmsBaseCatalog1;
import com.atguigu.gmall.manage.mapper.PmsBaseCatalog1Mapper;
import com.atguigu.gmall.manage.service.impl.CatalogServiceImpl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GmallManageServiceApplicationTests {

    @Autowired
    PmsBaseCatalog1Mapper pmsBaseCatalog1Mapper;
    @Test
   public void contextLoads() {
        pmsBaseCatalog1Mapper.selectAll();
    }

}
