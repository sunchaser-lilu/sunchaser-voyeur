package com.sunchaser.voyeur.api;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author SunChaser admin@lilu.org.cn
 * @since JDK8 2020/12/20
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
