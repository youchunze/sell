package com.ycz.sell.repository;

import com.ycz.sell.dataobject.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: ycz
 * @date: 2018/12/8 0008 13:36
 * @description:
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster,String> {

    /**
     * 查找该openid下所有订单，并分页
     * @param buyerOpenId
     * @param pageable
     * @return
     */
    Page<OrderMaster> findByBuyerOpenid(String buyerOpenId, Pageable pageable);


}
