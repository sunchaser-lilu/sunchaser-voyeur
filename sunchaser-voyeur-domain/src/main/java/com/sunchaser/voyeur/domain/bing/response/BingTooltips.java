package com.sunchaser.voyeur.domain.bing.response;

import lombok.Data;

/**
 * @author admin@lilu.org.cn
 * @description
 * "tooltips":{
 *         "loading":"正在加载...",
 *         "previous":"上一个图像",
 *         "next":"下一个图像",
 *         "walle":"此图片不能下载用作壁纸。",
 *         "walls":"下载今日美图。仅限用作桌面壁纸。"
 *  }
 * @date 2020/11/17
 * @since JDK 1.8
 */
@Data
public class BingTooltips {
    private String loading;
    private String previous;
    private String next;
    private String walle;
    private String walls;
}
