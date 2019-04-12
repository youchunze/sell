package com.ycz.sell.service.impl;

import com.ycz.sell.dataobject.ProductCategory;
import com.ycz.sell.repository.ProductCategoryRepository;
import com.ycz.sell.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: ycz
 * @date: 2018/12/7 0007 22:21
 * @description:类目
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private ProductCategoryRepository repository;
    @Override
    public ProductCategory findOne(Integer categoryId) {
        return repository.findOne(categoryId);
    }

    @Override
    public List<ProductCategory> findAll() {
        return repository.findAll();
    }

    @Override
    public List<ProductCategory> findAllByCategoryTypeIn(List<Integer> productCategoryList) {
        return repository.findAllByCategoryTypeIn(productCategoryList);
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return repository.save(productCategory);
    }
}
