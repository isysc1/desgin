
package com.desgin.creational.factorymethod;

import com.desgin.creational.factorymethod.wechatpay.WeChatPayFactory;

/**
 * @author Skow <isysc1@163.com>
 * @description 测试类
 * @date 2021/5/16 1:15 下午
 */
public class Test {
    public static void main(String[] args)  {
        PayFactory payFactory = new WeChatPayFactory();
        Pay pay = payFactory.getPayType();
        pay.pay();
    }
}
