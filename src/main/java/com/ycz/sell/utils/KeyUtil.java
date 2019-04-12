package com.ycz.sell.utils;

import java.util.Random;

/**
 * @author: ycz
 * @date: 2018/12/8 0008 13:04
 * @description:
 */
public class KeyUtil {


    /**
     * 生成唯一的主键
     * 格式：时间+随机数
     * @return
     */
    public static synchronized String getUniqueKey(){
        Random random = new Random();



        int number = random.nextInt(900000) + 100000;
        return System.currentTimeMillis() + String.valueOf(number);
    }
}
