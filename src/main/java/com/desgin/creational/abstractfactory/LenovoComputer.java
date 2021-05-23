package com.desgin.creational.abstractfactory;

/**
 * @author Skow <isysc1@163.com>
 * @description 联想主机
 * @date 2021/5/22 1:59 下午
 */
public class LenovoComputer extends Computer {
    /**
     * 生产主机
     */
    @Override
    public void produce() {
        System.out.println("生产联想主机");
    }
}
