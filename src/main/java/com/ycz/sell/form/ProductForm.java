package com.ycz.sell.form;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ycz.sell.enums.ProductStatusEnum;
import com.ycz.sell.utils.EnumUtil;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author: ycz
 * @date: 2018/12/13 0013 12:16
 * @description:
 */
@Data
public class ProductForm {

    private String productId;

    /** 名字. */
    private String productName;

    /** 单价. */
    private BigDecimal productPrice;

    /** 库存. */
    private Integer productStock;

    /** 描述. */
    private String productDescription;

    /** 小图. */
    private String productIcon;

    /** 类目编号. */
    private Integer categoryType;


}
