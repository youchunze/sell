package com.ycz.sell.form;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author: ycz
 * @date: 2018/12/9 0009 11:07
 * @description:
 */
@Data
public class OrderForm {
    /**
     * 买家姓名
     */
    @NotEmpty(message = "姓名必填")
    private String name;

    /**
     * 买家手机号
     */
    @NotEmpty(message = "手机号必填")
    private String phone;

    /**
     * 买家地址
     */
    @NotEmpty(message = "地址必填")
    private String address;

    /**
     * 买家openId
     */
    @NotEmpty(message = "openid必填")
    private String openid;

    /**
     * 买家购物车信息
     */
    @NotEmpty(message = "购物车不能为空")
    private String items;

}
