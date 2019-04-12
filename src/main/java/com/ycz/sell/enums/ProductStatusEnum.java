package com.ycz.sell.enums;

import lombok.Getter;

/**
 * @author: ycz
 * @date: 2018/12/8 0008 10:02
 * @description: 商品状态
 */
@Getter
public enum  ProductStatusEnum implements CodeEnum {
    /**
     * 商品在架
     */
    UP(0, "在架"),
    /**
     * 商品下架
     */
    DOWN(1, "下架")
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code,String message){
        this.code = code;
        this.message = message;
    }

}
