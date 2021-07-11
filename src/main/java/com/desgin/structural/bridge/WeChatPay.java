
package com.desgin.structural.bridge;

import java.math.BigDecimal;

/**
 * @author Skow <isysc1@163.com>
 * @description
 * @date 2021/6/23 1:00 下午
 */
public class WeChatPay extends Pay{

    public WeChatPay(IPayType payType) {
        super(payType);
    }

    @Override
    IPayType pay(BigDecimal amount) {
        System.out.println("微信支付中...");
        payType.payTypeCheck();
        payType.pay(amount);
        return null;
    }
}
