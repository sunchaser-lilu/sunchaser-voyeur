package com.sunchaser.voyeur.api;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author admin@lilu.org.cn
 * @description voyeur server start
 * @date 2020/11/17
 * @since JDK 1.8
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.sunchaser.voyeur")
public class SunChaserVoyeurApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(SunChaserVoyeurApplication.class)
                .web(WebApplicationType.SERVLET)
                .run(args);
    }
}
