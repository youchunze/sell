package com.ycz.sell.dto;

import lombok.Data;

/**
 * 购物车
 * @author: ycz
 * @date: 2018/12/8 0008 17:40
 * @description:
 */
@Data
public class CartDTO {

    /** 商品id. */
    private String productId;

    /** 商品数量. */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
