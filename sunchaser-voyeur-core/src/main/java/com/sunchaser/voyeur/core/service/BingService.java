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
 * @date 2020/11/17
 * @since JDK 1.8
 */
@Service
public class BingService {

    public
}
