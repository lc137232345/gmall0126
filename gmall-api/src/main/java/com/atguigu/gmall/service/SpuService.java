package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.PmsProductInfo;

import java.util.List;

public interface SpuService {

    public List<PmsProductInfo> spuList(String catalog3Id);

    String saveSpuInfo(PmsProductInfo pmsProductInfo);
}
