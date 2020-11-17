package com.sunchaser.voyeur.common.response;

import lombok.*;

/**
 * @author admin@lilu.org.cn
 * @description 请求统一响应包含data数据域的实体。供需要返回数据的请求使用。
 * @date 2020/11/17
 * @since JDK 1.8
 */
@Getter
@ToString
public class R<T> extends C {

    /**
     * 响应数据域
     */
    private T data;

    protected R() {
        super();
    }

    protected R(String code, String msg, T data) {
        super(code, msg);
        this.data = data;
    }

    /**
     * 成功时调用
     * @param c 返回码对象
     * @param t 数据域对象
     * @return HttpResponseData对象
     */
    public static <T> R<T> success(C c, T t) {
        return new R<>(c.getCode(), c.getMsg(),t);
    }

    /**
     * 失败时调用，失败时数据域为null。
     * @param c 返回码对象
     * @return HttpResponseData对象
     */
    public static <T> R<T> error(C c) {
        return new R<>(c.getCode(), c.getMsg(),null);
    }
}
