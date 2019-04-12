package com.ycz.sell.service.impl;

import com.ycz.sell.dataobject.SellerInfo;
import com.ycz.sell.exception.SellException;
import com.ycz.sell.repository.SellerInfoRepository;
import com.ycz.sell.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author: ycz
 * @date: 2018/12/13 0013 16:20
 * @description:
 */
public class  SellerServiceImpl implements SellerService {

    @Autowired
    private SellerInfoRepository sellerInfoRepository;

    @Override
    public SellerInfo findSellerInfoByOpenid(String openid) {
        return sellerInfoRepository.findByOpenid(openid);
    }
}
