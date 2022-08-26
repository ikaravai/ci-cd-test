package com.solvd.ikaravai.cicdtest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
@Slf4j
public class CiCdTestApplication {

    @PostConstruct
    public void method() {
        log.info("--- App constructed ---");
    }

    public static void main(String[] args) {
        log.info("--- App execution starting ---");
        SpringApplication.run(CiCdTestApplication.class, args);
    }

}
