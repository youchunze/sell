package com.ycz.sell.repository;

import com.ycz.sell.dataobject.SellerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Entity;

/**
 * @author: ycz
 * @date: 2018/12/13 0013 16:05
 * @description:
 */

public interface SellerInfoRepository extends JpaRepository<SellerInfo, String>{

    SellerInfo findByOpenid(String openid);
}
