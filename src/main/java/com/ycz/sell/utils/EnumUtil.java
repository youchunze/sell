package com.ycz.sell.utils;

import com.ycz.sell.enums.CodeEnum;

/**
 * @author: ycz
 * @date: 2018/12/12 0012 15:59
 * @description:
 */
public class EnumUtil {

    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass){
        for (T each: enumClass.getEnumConstants()){
            if (code.equals(each.getCode())){
                return each;
            }
        }
        return null;
    }
}
