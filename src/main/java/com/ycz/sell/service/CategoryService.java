package com.ycz.sell.service;

import com.ycz.sell.dataobject.ProductCategory;

import java.util.List;

/**
 * @author: ycz
 * @date: 2018/12/7 0007 22:16
 * @description:
 */
public interface CategoryService {
    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();


    /**
     * 查询所以商品类目
     * @param productCategoryList
     * @return
     */
    List<ProductCategory> findAllByCategoryTypeIn(List<Integer> productCategoryList);

    ProductCategory save(ProductCategory productCategory);
}
