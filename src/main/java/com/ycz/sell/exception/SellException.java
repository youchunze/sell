package com.ycz.sell.exception;

import com.ycz.sell.enums.ResultEnum;

/**
 * @author: ycz
 * @date: 2018/12/8 0008 12:51
 * @description:
 */
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());

        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String msg){
        super(msg);

        this.code = code;

    }
}
