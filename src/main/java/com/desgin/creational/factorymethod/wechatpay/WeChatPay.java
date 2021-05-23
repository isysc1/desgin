
package com.desgin.creational.factorymethod.wechatpay;

import com.desgin.creational.factorymethod.Pay;

/**
 * @author Skow <isysc1@163.com>
 * @description 微信支付
 * @date 2021/5/16 1:13 下午
 */
public class  WeChatPay extends Pay {
    /**
     * 微信支付
     */
    @Override
    public void pay() {
        System.out.println("我是微信支付");
    }
}
