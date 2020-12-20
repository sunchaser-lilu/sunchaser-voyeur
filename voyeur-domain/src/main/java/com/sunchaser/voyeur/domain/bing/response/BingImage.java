package com.sunchaser.voyeur.domain.bing.response;

import lombok.Data;

import java.util.List;

/**
 *         {
 *             "startdate":"20201121",
 *             "fullstartdate":"202011211600",
 *             "enddate":"20201122",
 *             "url":"/th?id=OHR.Dromling_ZH-CN0730577626_1920x1080.jpg&rf=LaDigue_1920x1080.jpg&pid=hp",
 *             "urlbase":"/th?id=OHR.Dromling_ZH-CN0730577626",
 *             "copyright":"Drömling湿地中的灰鹤，德国 (© Mike Friedrichs/Getty Images)",
 *             "copyrightlink":"https://www.bing.com/search?q=Dr%C3%B6mling%E6%B9%BF%E5%9C%B0&form=hpcapt&mkt=zh-cn",
 *             "title":"",
 *             "quiz":"/search?q=Bing+homepage+quiz&filters=WQOskey:%22HPQuiz_20201121_Dromling%22&FORM=HPQUIZ",
 *             "wp":true,
 *             "hsh":"442e2b414a95e8120a8c5e94c9399c54",
 *             "drk":1,
 *             "top":1,
 *             "bot":1,
 *             "hs":[
 *
 *             ]
 *         }
 * @author SunChaser admin@lilu.org.cn
 * @since JDK8 2020/12/20
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
    private Boolean wp;
    private String hsh;
    private Integer drk;
    private Integer top;
    private Integer bot;
    private List<Object> hs;
}
