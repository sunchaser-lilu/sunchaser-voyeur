package com.sunchaser.voyeur.core.service;

import org.springframework.stereotype.Service;

/**
 * @author admin@lilu.org.cn
 * @description
 *
 * bing每日图片的地址为：http://cn.bing.com/HPImageArchive.aspx?format=js&idx=0&n=1
 *
 * n，必要参数。这是输出信息的数量。比如n=1，即为1条，以此类推，至多输出8条。
 * format，非必要。返回结果的格式，不存在或者等于xml时，输出为xml格式，等于js时，输出json格式
 * idx，非必要。不存在或者等于0时，输出当天的图片，-1为已经预备用于明天显示的信息，1则为昨天的图片，以此类推，idx最多获取到前16天的图片信息
 *
 * 返回示例
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
 * @date 2020/11/17
 * @since JDK 1.8
 */
@Service
public class BingService {

}
