package com.desgin.creational.abstractfactory;

/**
 * @author Skow <isysc1@163.com>
 * @description 抽象工厂测试类
 * @date 2021/5/22 2:06 下午
 */
public class Test {
    public static void main(String[] args) {
        DesktopComputerFactory lenovoDesktopComputerFactory = new LenovoDesktopComputerFactory();
        Computer computer = lenovoDesktopComputerFactory.getComputer();
        DisplayScreen displayScreen = lenovoDesktopComputerFactory.getDisplayScreen();
        computer.produce();
        displayScreen.produce();
    }
}
