package com.ycz.sell.VO;

import lombok.Data;

/**
 * @author: ycz
 * @date: 2018/12/8 0008 10:26
 * @description:
 */
@Data
public class ResultVO<T> {

    /** 错误码. */
    private Integer code;

    /** 提示信息. */
    private String msg;

    /** 具体内容. */
    private T data;
}
