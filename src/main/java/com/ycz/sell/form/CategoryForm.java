package com.ycz.sell.form;

import lombok.Data;

/**
 * @author: ycz
 * @date: 2018/12/13 0013 15:35
 * @description:
 */
@Data
public class CategoryForm {
    private Integer categoryId;
    /**类目名字.*/
    private String categoryName;
    /**类目编号.*/
    private Integer categoryType;
}
