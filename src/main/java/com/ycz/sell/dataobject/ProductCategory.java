package com.ycz.sell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author: ycz
 * @date: 2018/12/7 0007 21:21
 * @description: 类目
 */
@Entity
@DynamicUpdate
@Data
public class ProductCategory {
    /**类目id.*/
    @Id
    @GeneratedValue
    private Integer categoryId;
    /**类目名字.*/
    private String categoryName;
    /**类目编号.*/
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;

    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
