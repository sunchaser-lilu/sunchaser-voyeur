package com.sunchaser.voyeur.domain.bing.response;

import lombok.Data;

import java.util.List;

/**
 * {
 *     "images":[
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
 *     ],
 *     "tooltips":{
 *         "loading":"正在加载...",
 *         "previous":"上一个图像",
 *         "next":"下一个图像",
 *         "walle":"此图片不能下载用作壁纸。",
 *         "walls":"下载今日美图。仅限用作桌面壁纸。"
 *     }
 * }
 * @author SunChaser admin@lilu.org.cn
 * @since JDK8 2020/12/20
 */
@Data
public class BingApiResponse {
    private List<BingImage> images;
    private BingTooltips tooltips;
}
