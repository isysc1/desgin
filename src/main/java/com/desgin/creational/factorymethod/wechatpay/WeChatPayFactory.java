
package com.desgin.creational.factorymethod.wechatpay;

import com.desgin.creational.factorymethod.Pay;
import com.desgin.creational.factorymethod.PayFactory;

/**
 * @author Skow <isysc1@163.com>
 * @description
 * @date 2021/5/17 7:57 下午
 */
public class WeChatPayFactory implements PayFactory {

    /**
     * 调用支付
     *
     * @return 支付抽象类
     */
    @Override
    public Pay getPayType() {
        return new WeChatPay();
    }
}
