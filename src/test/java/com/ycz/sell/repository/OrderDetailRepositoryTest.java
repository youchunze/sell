package com.ycz.sell.repository;

import com.ycz.sell.dataobject.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author: ycz
 * @date: 2018/12/8 0008 14:08
 * @description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {

    @Autowired
    private OrderDetailRepository repository;

    @Test
    public void findByOrderId() throws Exception {
        List<OrderDetail> result = repository.findByOrderId("1544248790621569428");
        Assert.assertNotEquals(0,result.size());

    }

    @Test
    public void saveTest(){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("123456780");
        orderDetail.setOrderId("1544248790621569428");
        orderDetail.setProductId("123");
        orderDetail.setProductName("阿瑟东");
        orderDetail.setProductPrice(new BigDecimal(311.1));
        orderDetail.setProductQuantity(12);
        orderDetail.setProductIcon("http://xxxxx.jpg");
        OrderDetail result = repository.save(orderDetail);
        Assert.assertNotNull(result);

    }

}