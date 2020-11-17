package com.sunchaser.voyeur.common.enums;

import com.google.common.collect.Maps;
import lombok.Getter;

import java.util.Map;

/**
 * @author admin@lilu.org.cn
 * @description
 * @date 2020/11/17
 * @since JDK 1.8
 */
@Getter
public enum BingFormatEnum {
    JSON("js","JSON格式"),
    XML("xml","XML格式"),
    ;

    /**
     * bing格式
     */
    private final String format;

    /**
     * 描述
     */
    private final String desc;

    BingFormatEnum(String format, String desc) {
        this.format = format;
        this.desc = desc;
    }

    private static final Map<String, BingFormatEnum> enumMap = Maps.newHashMap();

    static {
        for (BingFormatEnum bingFormatEnum : BingFormatEnum.values())
            enumMap.put(bingFormatEnum.format, bingFormatEnum);
    }

    public BingFormatEnum getBingFormatEnumByFormat(String format) {
        return enumMap.get(format);
    }
}
