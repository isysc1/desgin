package com.desgin.structural.facde;

/**
 * @author isysc1@163.com
 * @date 2020/7/11
 */
public class Test {
    public static void main(String[] args) {
//      生成一个礼物对象
        Gift gift = new Gift(" iphone999 ");
//      没有 Spring 环境，直接 new GiftService. 如果在 Spring 环境中，直接注入 GiftService 就可以调用啦
        GiftService giftService = new GiftService();

//      调用统一的接口
        giftService.giftExchange(gift);
    }
}
