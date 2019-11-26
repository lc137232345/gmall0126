package com.atguigu.common;

import org.csource.common.MyException;
import org.csource.fastdfs.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public class PmsLoadUtil {

    public static String loadimage(MultipartFile multipartFile) throws IOException, MyException {
        //获得字节流文件
        byte[] bytes = multipartFile.getBytes();
        //获得后缀名
        String originalFilename = multipartFile.getOriginalFilename();
        int i = originalFilename.lastIndexOf('.');
        String substring = originalFilename.substring(i+1);


        //获得配置文件
        String file=PmsLoadUtil.class.getResource("/tracker.conf").getPath();
        //初始化全局
        ClientGlobal.init(file);
        //获得tracker客户端
        TrackerClient trackerClient=new TrackerClient();
        //获得tracker服务
        TrackerServer trackerServer = trackerClient.getConnection();
        //通过tracked服务获得stora客户端
        StorageClient storageClient=new StorageClient(trackerServer,null);


        //上传文件
        String[] uploadInfo = storageClient.upload_file(bytes, substring, null);


        String url="http://192.168.40.128";
        for (String string : uploadInfo) {
            url+="/"+string;
        }
        return url;
    }
}
