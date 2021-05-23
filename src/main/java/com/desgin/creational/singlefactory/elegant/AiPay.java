
package com.desgin.creational.singlefactory.elegant;

/**
 * @author Skow <isysc1@163.com>
 * @description 阿里支付
 * @date 2021/5/16 1:14 下午
 */
public class AiPay extends Pay{
    /**
     * 阿里支付
     */
    @Override
    public void pay() {
        System.out.println("阿里支付");
    }
}
