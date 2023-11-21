package com.prowings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

@SpringBootApplication
public class InterceptorsInSpringBootApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(InterceptorsInSpringBootApiApplication.class, args);
    }

//    @Bean
//    public CommonsRequestLoggingFilter requestLoggingFilter() {
//        return new CommonsRequestLoggingFilter();
//    }
}
