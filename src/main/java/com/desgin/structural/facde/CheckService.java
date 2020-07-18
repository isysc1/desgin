package com.desgin.structural.facde;

/**
 * @author isysc1@163.com
 * @date 2020/7/11
 */
public class CheckService {
    public Boolean isAvaliable(Gift gift) {
        System.out.println("校验" + gift.getName() + "积分，库存通过");
        return true;
    }
}
