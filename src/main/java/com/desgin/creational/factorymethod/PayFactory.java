
package com.desgin.creational.factorymethod;

/**
 * @author Skow <isysc1@163.com>
 * @description 支付工厂
 * @date 2021/5/17 7:54 下午
 */
public interface PayFactory {
    /**
     * 调用支付
     *
     * @return  支付抽象类
     */
    Pay getPayType();
}
