package com.codingshuttle.manju.IntroductionToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService implements DB {

    @Autowired
    private DB db;
    public String getData(){
        return db.getData();
    }
}
