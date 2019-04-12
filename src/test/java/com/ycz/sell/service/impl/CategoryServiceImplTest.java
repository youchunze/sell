package com.ycz.sell.service.impl;

import com.ycz.sell.dataobject.ProductCategory;
import com.ycz.sell.repository.ProductCategoryRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author: ycz
 * @date: 2018/12/7 0007 22:24
 * @description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {
    @Autowired
    private ProductCategoryRepository repository;
    @Test
    public void findOne() throws Exception {
        ProductCategory productCategory = repository.findOne(1);
        Assert.assertEquals(new Integer(1),productCategory.getCategoryId());
    }

    @Test
    public void findAll() throws Exception {
        List<ProductCategory> list = repository.findAll();
        Assert.assertNotEquals(0,list.size());
    }

    @Test
    public void findAllByCategoryTypeInTest() throws Exception {
        List<Integer> list = Arrays.asList(1,2,3);
        List<ProductCategory> productCategoryList = repository.findAllByCategoryTypeIn(list);
        Assert.assertNotEquals(0,productCategoryList.size());
    }

    @Test
    @Transactional
    public void save() throws Exception {
        ProductCategory productCategory = new ProductCategory("玩具",4);
        ProductCategory result = repository.save(productCategory);
        Assert.assertNotNull(result);
    }

}