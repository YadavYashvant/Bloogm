package com.yashvant.bloogm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication/*(exclude = {DataSourceAutoConfiguration.class})*/
public class BloogmApplication {

    public static void main(String[] args) {
        SpringApplication.run(BloogmApplication.class, args);
    }

}
