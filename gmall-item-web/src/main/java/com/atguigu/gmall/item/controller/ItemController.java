package com.atguigu.gmall.item.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.PmsProductSaleAttr;
import com.atguigu.gmall.bean.PmsSkuInfo;
import com.atguigu.gmall.service.SkuService;
import com.atguigu.gmall.service.SpuService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@CrossOrigin
public class ItemController {
    @Reference
    private SkuService skuService;
    @Reference
    private SpuService spuService;
   @RequestMapping("{skuId}.html")
    public String index(@PathVariable String skuId,ModelMap modelMap){
        PmsSkuInfo pmsSkuInfo= skuService.getSkuInfo(skuId);
        //sku对象
       modelMap.put("skuInfo",pmsSkuInfo);

        //销售属性列表
       List<PmsProductSaleAttr> pmsProductSaleAttrList=spuService.spuSaleAttrListCheckBySku(pmsSkuInfo.getProductId());
       modelMap.put("spuSaleAttrListCheckBySku",pmsProductSaleAttrList);
        return "item";
    }
}
