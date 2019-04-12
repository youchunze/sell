package com.ycz.sell.enums;

import lombok.Getter;

/**
 * @author: ycz
 * @date: 2018/12/8 0008 13:21
 * @description: 订单状态
 */
@Getter
public enum OrderStatusEnum implements CodeEnum {

    /**
     * 订单状态
     */
    NEW(0,"新订单"),
    FINISHED(1,"完结"),
    CANCEL(2,"取消")
    ;

    private Integer code;
    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
