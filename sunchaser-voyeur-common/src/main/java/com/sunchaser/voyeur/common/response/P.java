package com.sunchaser.voyeur.common.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author admin@lilu.org.cn
 * @description 请求统一响应包含data数据域和数据总数的实体。供需要分页查询的请求使用。
 * @date 2020/11/17
 * @since JDK 1.8
 */
@Getter
@ToString
@NoArgsConstructor
public class P<T> extends R<T> {

    /**
     * 数据总记录数，前端可根据总记录数算出总页数。
     */
    private Integer count;
}
