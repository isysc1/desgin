package com.desgin.structural.facade;

/**
 * @author isysc1@163.com
 * @date 2020/7/11
 */
public class ShippingService {
    public String shipGift(Gift gift) {
        System.out.println("正在运输" + gift.getName());
        String shippingOrderNo = "666";
        return shippingOrderNo;
    }
}
