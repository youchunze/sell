package com.ycz.sell.repository;

import com.ycz.sell.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author: ycz
 * @date: 2018/12/7 0007 23:02
 * @description:
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String>{
    /**
     * 查询上架商品
     * @param productStatus
     * @return
     */
    List<ProductInfo> findByProductStatus(Integer productStatus);
}
