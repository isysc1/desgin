
package com.desgin.creational.abstractfactory;

/**
 * @author Skow <isysc1@163.com>
 * @description 联想显示屏
 * @date 2021/5/22 2:00 下午
 */
public class LenovoDisplayScreen extends DisplayScreen{
    /**
     * 生产显示屏
     */
    @Override
    public void produce() {
        System.out.println("生产联想显示屏");
    }
}
