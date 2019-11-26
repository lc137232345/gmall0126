package com.atguigu.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.PmsSkuInfo;
import com.atguigu.gmall.service.SkuService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin
@RequestMapping
public class SkuController {

    @Reference
    private SkuService skuService;


  //  http://127.0.0.1:8081/saveSkuInfo
    @ResponseBody
    @RequestMapping("saveSkuInfo")
    public String saveSkuInfo(@RequestBody PmsSkuInfo pmsSkuInfo){
        //封装spuProductId
        pmsSkuInfo.setProductId(pmsSkuInfo.getSpuId());
         String  s=skuService.saveSkuInfo(pmsSkuInfo);
         //处理默认图片
        if (StringUtils.isBlank(pmsSkuInfo.getSkuDefaultImg()))
            pmsSkuInfo.setSkuDefaultImg(pmsSkuInfo.getSkuImageList().get(0).getImgUrl());

        return s;
    }


}
