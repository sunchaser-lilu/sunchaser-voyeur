package com.sunchaser.voyeur.common.response;

import lombok.*;

/**
 * @author admin@lilu.org.cn
 * @description HTTP请求统一响应不包含data数据域的实体，提供通用状态码供R使用
 * @date 2020/11/17
 * @since JDK 1.8
 */
@Getter
@ToString
public class C {

    /**
     * 状态码
     */
    private String code;

    /**
     * 状态描述
     */
    private String msg;

    /* 通用返回状态码 */
    public static final C SUCCESS = new C("10000","操作成功");
    public static final C FAIL = new C("20000","操作失败");
    public static final C PARAM_NOT_VALID = new C("20000","参数不合法");

    protected C() {
    }

    protected C(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
