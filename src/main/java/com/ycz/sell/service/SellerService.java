package com.ycz.sell.service;

import com.ycz.sell.dataobject.SellerInfo;

/**
 * @author: ycz
 * @date: 2018/12/13 0013 16:19
 * @description:
 */
public interface SellerService {

    SellerInfo findSellerInfoByOpenid(String openid);
}
