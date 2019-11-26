package com.atguigu.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.PmsBaseAttrInfo;
import com.atguigu.gmall.bean.PmsBaseAttrValue;
import com.atguigu.gmall.bean.PmsBaseSaleAttr;
import com.atguigu.gmall.service.AttrService;
import com.atguigu.gmall.service.CatalogService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
@RequestMapping
public class AttrController {
    @Reference
    private AttrService attrService;


    @RequestMapping("attrInfoList")
    @ResponseBody
     public List<PmsBaseAttrInfo> attrInfoList(String catalog3Id){
         List<PmsBaseAttrInfo>  pmsBaseAttrInfos=attrService.attrInfoList(catalog3Id);
         return pmsBaseAttrInfos;
     }

    @RequestMapping("saveAttrInfo")
    @ResponseBody
    public String saveAttrInfo(@RequestBody  PmsBaseAttrInfo pmsBaseAttrInfo ){
        String s = attrService.saveAttrInfo(pmsBaseAttrInfo);
        return "success";
    }

   // 查询属性值
    @RequestMapping("getAttrValueList")
    @ResponseBody
    public List<PmsBaseAttrValue> getAttrValueList(String attrId ){
        List<PmsBaseAttrValue> pmsBaseAttrValues = attrService.getAttrValueList(attrId);
        return pmsBaseAttrValues;
    }

    @RequestMapping("baseSaleAttrList")
    @ResponseBody
    public List<PmsBaseSaleAttr> baseSaleAttrList(){
        List<PmsBaseSaleAttr>  pmsBaseSaleAttrs=attrService.baseSaleAttrList();
        return pmsBaseSaleAttrs;
    }

}
