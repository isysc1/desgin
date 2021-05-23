
package com.desgin.creational.abstractfactory;

/**
 * @author Skow <isysc1@163.com>
 * @description 台式电脑生产工厂
 * @date 2021/5/22 2:02 下午
 */
public interface DesktopComputerFactory {
    /**
     * 获取主机
     *
     * @return 生产主机
     */
    Computer getComputer();

    /**
     * 获取显示屏
     *
     * @return 生产显示屏
     */
    DisplayScreen getDisplayScreen();
}
