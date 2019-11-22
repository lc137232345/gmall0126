package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.atgui.gmall.user.mapper")
public class GmallUserSeriviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallUserSeriviceApplication.class, args);
    }

}
