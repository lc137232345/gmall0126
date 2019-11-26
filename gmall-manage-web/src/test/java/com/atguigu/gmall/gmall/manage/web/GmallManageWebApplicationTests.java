package com.atguigu.gmall.gmall.manage.web;

import org.csource.common.MyException;
import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.IOException;

@SpringBootTest
@RunWith(SpringRunner.class)
public class GmallManageWebApplicationTests {

    @Test
public     void contextLoads() throws IOException, MyException {
        String file=GmallManageWebApplicationTests.class.getResource("/tracke.conf").getPath();
        ClientGlobal.init(file);
        TrackerClient trackerClient=new TrackerClient();
        //获得一个trackerserver
        TrackerServer trackerServer = trackerClient.getConnection();
        StorageClient storageClient=new StorageClient(trackerServer,null);

        String[] uploadFile = storageClient.upload_file("e:/11.png", "jpg", null);
        for (String s : uploadFile) {
            System.out.println(s);

        }

    }
/*    @Test
    public     void contextLoads111() throws IOException, MyException {
        MultipartFile multipartFile=new CommonsMultipartFile("e:/11.png");
        multipartFile.getBytes()

    }*/

}
