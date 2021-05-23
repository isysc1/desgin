
package com.desgin.creational.singlefactory.elegant;

/**
 * @author Skow <isysc1@163.com>
 * @description 支付工厂
 * @date 2021/5/16 1:26 下午
 */
public class PayFactory {
    //
    // public Pay pay(String payType) {
    //     if (Objects.equals("1", payType)) {
    //         return new AiPay();
    //     }
    //     if (Objects.equals("2",payType)) {
    //         return new WeChatPay();
    //     }
    //     return null;
    // }

    public Pay pay(Class c) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Pay pay = null;
        pay = (Pay) Class.forName(c.getName())
            .newInstance();
        return pay;
    }
}
