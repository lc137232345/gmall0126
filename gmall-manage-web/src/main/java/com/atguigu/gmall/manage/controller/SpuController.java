package com.atguigu.gmall.manage.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.common.PmsLoadUtil;
import com.atguigu.gmall.bean.*;
import com.atguigu.gmall.service.SpuService;
import org.csource.common.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;


@Controller
@RequestMapping
@CrossOrigin
public class SpuController {
    @Reference
    private SpuService spuService;

    @RequestMapping("spuList")
    @ResponseBody
    public List<PmsProductInfo> spuList(String  catalog3Id ){
        List<PmsProductInfo> pmsProductInfos = spuService.spuList(catalog3Id);
        return  pmsProductInfos;
    }
    //saveSpuInfo
    @RequestMapping("saveSpuInfo")
    @ResponseBody
    public String saveSpuInfo(@RequestBody PmsProductInfo pmsProductInfo){
        String   success = spuService.saveSpuInfo(pmsProductInfo);
        return  success;
    }

    @RequestMapping("fileUpload")
    @ResponseBody
    public String fileUpload(@RequestParam("file") MultipartFile  multipartFile) throws IOException, MyException {


        String   imgUrl = PmsLoadUtil.loadimage(multipartFile);
        return  imgUrl;
    }

    //http://127.0.0.1:8081/spuSaleAttrList?spuId=24
    @RequestMapping("spuSaleAttrList")
    @ResponseBody
    public List<PmsProductSaleAttr> spuSaleAttrList(String spuId) {
          return spuService.spuSaleAttrList(spuId);
    }

  //  http://127.0.0.1:8081/spuImageList?spuId=24
      @RequestMapping("spuImageList")
      @ResponseBody
      public List<PmsProductImage> spuImageList(String  spuId ){
          List<PmsProductImage> pmsProductImages = spuService.spuImageList(spuId);
          return  pmsProductImages;
      }
}
