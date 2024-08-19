package com.codingshuttle.manju.IntroductionToSpringBoot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class AppleConfig {

    @Bean
    Apple getApple() {
        return new Apple();
    }
}
