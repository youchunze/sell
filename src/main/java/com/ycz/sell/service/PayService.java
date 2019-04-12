package com.ycz.sell.service;

import com.ycz.sell.dto.OrderDTO;

/**
 * @author: ycz
 * @date: 2018/12/10 0010 17:09
 * @description:
 */
public interface PayService {

    void create(OrderDTO orderDTO);
}
