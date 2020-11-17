package com.sunchaser.voyeur.domain.bing.response;

import lombok.Data;

/**
 * @author admin@lilu.org.cn
 * @description
 * @date 2020/11/17
 * @since JDK 1.8
 */
@Data
public class BingImage {
    private String startdate;
    private String fullstartdate;
    private String enddate;
    private String url;
    private String urlbase;
    private String copyright;
    private String copyrightlink;
    private String title;
    private String quiz;
    private boolean wp;
    private String hsh;
    private Integer drk;
    private Integer top;
    private Integer bot;
}
