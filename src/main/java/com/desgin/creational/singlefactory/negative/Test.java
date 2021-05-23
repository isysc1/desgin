
package com.desgin.creational.singlefactory.negative;

/**
 * @author Skow <isysc1@163.com>
 * @description 测试类
 * @date 2021/5/16 1:15 下午
 */
public class Test {
    public static void main(String[] args) {
        // 父类引用指向子类对象
        Pay pay = new AiPay();
        // 调用子类方法
        pay.pay();

    }
}
