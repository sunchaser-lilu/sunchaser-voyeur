package com.sunchaser.voyeur.api.web.controller;

import com.sunchaser.voyeur.core.service.BingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author SunChaser admin@lilu.org.cn
 * @since JDK8 2020/12/20
 */
@RestController
@RequestMapping("/bing")
public class BingController {
    @GetMapping("/echo")
    public void echo() {
        System.out.println("echo");
    }

    @Autowired
    private BingService bingService;
}
