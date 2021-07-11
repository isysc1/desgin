package com.desgin.structural.bridge;

import java.math.BigDecimal;

/**
 * @author Skow <isysc1@163.com>
 * @description
 * @date 2021/6/23 9:50 下午
 */
public class Test {
    public static void main(String[] args) {
        WeChatPay weChatPay = new WeChatPay(new PayCypher());
        weChatPay.pay(new BigDecimal("20"));

        AiLiPay aiLiPay = new AiLiPay(new PayFace());
        aiLiPay.pay(new BigDecimal("201"));
    }
}
