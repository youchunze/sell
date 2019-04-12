package com.ycz.sell.service.impl;

import com.ycz.sell.dataobject.SellerInfo;
import com.ycz.sell.repository.SellerInfoRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author: ycz
 * @date: 2018/12/13 0013 16:22
 * @description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SellerServiceImplTest {

    private static final String openid = "abc";

    @Autowired
    private SellerInfoRepository sellerInfoRepository;
    @Test
    public void findSellerInfoByOpenid() throws Exception {
        SellerInfo sellerInfo = sellerInfoRepository.findByOpenid(openid);
        Assert.assertEquals(openid,sellerInfo.getOpenid());
    }

}