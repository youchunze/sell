package com.ycz.sell.service;

import com.ycz.sell.dto.OrderDTO;

/**
 * @author: ycz
 * @date: 2018/12/9 0009 15:30
 * @description:
 */
public interface BuyerService {

    /**
     * 查找一个订单
     * @param openid
     * @param orderId
     * @return
     */
    OrderDTO findOrderOne(String openid,String orderId);

    /**
     * 取消订单
     * @param openid
     * @param orderId
     * @return
     */
    OrderDTO cancelOrder(String openid,String orderId);

}
