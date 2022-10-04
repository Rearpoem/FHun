package com.fhun.starry.service.Impl;


import com.fhun.starry.service.ConfigService;
import com.fhun.starry.mybatis.po.Typer;
import com.fhun.starry.mybatis.service.TyperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class ConfigServiceImpl implements ConfigService {

    @Autowired
    private TyperService typerService;

    @Override
    public Typer getRandomTyper() {
        List<Typer> list = typerService.lambdaQuery()
                .eq(Typer::getDeleteFlag, 0).list();
        if(list!=null){
            int size = list.size();
            Random random = new Random();
            Typer typer = list.get(random.nextInt(size));
            return typer;
        }
        return null;
    }
}
