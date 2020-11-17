package com.sunchaser.voyeur.domain.bing.request;

import com.sunchaser.voyeur.common.enums.BingFormatEnum;
import lombok.Data;

/**
 * @author admin@lilu.org.cn
 * @description http://cn.bing.com官方API所需参数
 * @date 2020/11/17
 * @since JDK 1.8
 */
@Data
public class BingApiRequest {
    /**
     * 数据返回格式
     */
    private String format = BingFormatEnum.JSON.getFormat();

    /**
     * 非必要。不存在或者等于0时，输出当天的图片，-1为已经预备用于明天显示的信息，1则为昨天的图片，以此类推，idx最多获取到前16天的图片信息
     */
    private Integer idx = 0;

    /**
     * 必要参数。这是输出信息的数量。比如n=1，即为1条，以此类推，至多输出8条。
     */
    private Integer n = 1;
}
