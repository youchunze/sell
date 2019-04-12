package com.ycz.sell.converter;

import com.ycz.sell.dataobject.OrderMaster;
import com.ycz.sell.dto.OrderDTO;
import org.springframework.beans.BeanUtils;

 import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: ycz
 * @date: 2018/12/8 0008 17:29
 * @description:
 */
public class OrderMaster2OrderDTOConverter {

    public static OrderDTO converter(OrderMaster orderMaster){
        OrderDTO orderDTO = new OrderDTO();
        BeanUtils.copyProperties(orderMaster,orderDTO);
        return orderDTO;
    }

    public static List<OrderDTO> converter(List<OrderMaster> orderMasterList){
        return orderMasterList.stream().map( e -> converter(e))
                .collect(Collectors.toList());
    }


}
