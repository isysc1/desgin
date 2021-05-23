package com.desgin.creational.abstractfactory;

/**
 * @author Skow <isysc1@163.com>
 * @description 联想台式电脑生产工厂
 * @date 2021/5/22 2:02 下午
 */
public class LenovoDesktopComputerFactory implements DesktopComputerFactory {
    /**
     * 获取主机
     *
     * @return 生产主机
     */
    @Override
    public Computer getComputer() {
        return new LenovoComputer();
    }

    /**
     * 获取显示屏
     *
     * @return 生产显示屏
     */
    @Override
    public DisplayScreen getDisplayScreen() {
        return new LenovoDisplayScreen();
    }
}
