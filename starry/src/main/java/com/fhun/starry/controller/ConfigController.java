package com.fhun.starry.controller;


import com.fhun.starry.service.ConfigService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import com.fhun.starry.mybatis.dto.Response;
import com.fhun.starry.mybatis.po.Typer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "配置")
@RestController
@Slf4j
public class ConfigController {
    @Autowired
    ConfigService configService;


    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/getTyper")
    public Response getRandomTyper(){
        Typer randomTyper = configService.getRandomTyper();
        if(randomTyper!=null){
            return new Response(randomTyper);
        }else {
            return new Response();
        }
    }
}
