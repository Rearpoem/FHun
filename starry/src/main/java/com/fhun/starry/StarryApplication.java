package com.fhun.starry;

import com.github.xiaoymin.swaggerbootstrapui.annotations.EnableSwaggerBootstrapUI;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.fhun.**")
public class StarryApplication {

    public static void main(String[] args) {
        SpringApplication.run(StarryApplication.class, args);
    }

}
