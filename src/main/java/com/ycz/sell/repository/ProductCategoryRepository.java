package com.ycz.sell.repository;

import com.ycz.sell.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author: ycz
 * @date: 2018/12/7 0007 21:31
 * @description:
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {
    /**
     *根据多个商品类目查找
     * @param productCategoryList
     * @return
     */
    List<ProductCategory> findAllByCategoryTypeIn(List<Integer> productCategoryList);
}
