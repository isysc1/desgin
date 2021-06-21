package com.desgin.creational.prototype.clone;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

/**
 * @author Skow <isysc1@163.com>
 * @description
 * @date 2021/5/27 8:37 下午
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Date birthday = new Date(0L);
        Pig pig1 = new Pig("佩奇",birthday);
        Pig pig2 = (Pig) pig1.clone();
        System.out.println(pig1);
        System.out.println(pig2);

        System.out.println("------------------------");
        pig1.getBirthday().setTime(666666666666L);

        System.out.println(pig1);
        System.out.println(pig2);
    }
}
