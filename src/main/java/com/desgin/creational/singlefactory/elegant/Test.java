
package com.desgin.creational.singlefactory.elegant;

/**
 * @author Skow <isysc1@163.com>
 * @description 测试类
 * @date 2021/5/16 1:15 下午
 */
public class Test {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        // PayFactory payFactory = new PayFactory();
        // Pay pay = payFactory.pay("1");
        // pay.pay();

        PayFactory payFactory = new PayFactory();
        Pay pay = payFactory.pay(AiPay.class);
        pay.pay();
    }
}
