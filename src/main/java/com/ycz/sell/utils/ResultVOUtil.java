package com.ycz.sell.utils;

import com.ycz.sell.VO.ResultVO;

/**
 * @author: ycz
 * @date: 2018/12/8 0008 11:26
 * @description:
 */
public class ResultVOUtil {

    public static ResultVO success(){
        return success(null);
    }

    public static ResultVO success(Object object){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(object);
        return resultVO;
    }

    public static ResultVO error(Integer code,String msg){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }
}
