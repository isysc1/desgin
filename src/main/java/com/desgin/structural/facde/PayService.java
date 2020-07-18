package com.desgin.structural.facde;

/**
 * @author isysc1@163.com
 * @date 2020/7/11
 */
public class PayService {
    public Boolean pay(Gift gift) {
        System.out.println("支付" + gift.getName() + "成功");
        return true;
    }
}
