package com.codingshuttle.manju.IntroductionToSpringBoot;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

public class Apple {
    void eat() {
        System.out.println("Eating apple");
    }

    @PostConstruct
    void callThisBeforeAppleIsUsed() {
        System.out.println("Calling this before apple is used");
    }

    @PreDestroy
    void callThisMethodBeforeDestory() {
        System.out.println("Calling this method before destroy");
    }
}
