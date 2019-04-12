package com.ycz.sell.repository;

import com.ycz.sell.dataobject.SellerInfo;
import com.ycz.sell.utils.KeyUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author: ycz
 * @date: 2018/12/13 0013 16:07
 * @description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SellerInfoRepositoryTest {

    @Autowired
    private SellerInfoRepository repository;

    @Test
    public void save(){
        SellerInfo sellerInfo = new SellerInfo();
        sellerInfo.setSellerId(KeyUtil.getUniqueKey());
        sellerInfo.setUsername("admin");
        sellerInfo.setPassword("admin");
        sellerInfo.setOpenid("abc");

        SellerInfo result = repository.save(sellerInfo);

        Assert.assertNotNull(result);
    }
    @Test
    public void findByOpenid() throws Exception {
        SellerInfo sellerInfo = repository.findByOpenid("abc");
        Assert.assertEquals("abc",sellerInfo.getOpenid());
    }

}