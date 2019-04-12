package com.ycz.sell.converter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ycz.sell.dataobject.OrderDetail;
import com.ycz.sell.dto.OrderDTO;
import com.ycz.sell.enums.ResultEnum;
import com.ycz.sell.exception.SellException;
import com.ycz.sell.form.OrderForm;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: ycz
 * @date: 2018/12/9 0009 11:23
 * @description:
 */
@Slf4j
public class OderForm2OrderDTOConverter {

    public static OrderDTO converter(OrderForm orderForm){
        Gson gson = new Gson();
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setBuyerName(orderForm.getName());
        orderDTO.setBuyerPhone(orderForm.getPhone());
        orderDTO.setBuyerAddress(orderForm.getAddress());
        orderDTO.setOrderId(orderDTO.getOrderId());
        orderDTO.setBuyerOpenid(orderForm.getOpenid());
        List<OrderDetail> orderDetailList = new ArrayList<>();
        try {
            orderDetailList = gson.fromJson(orderForm.getItems(),new TypeToken<List<OrderDetail>>(){}.getType());
        }catch (Exception e){
            log.error("【对象转换】 错误，String={}",orderForm.getItems());
            throw new SellException(ResultEnum.PARAM_ERROR);
        }

        orderDTO.setOrderDetailList(orderDetailList);

        return orderDTO;
    }
}
