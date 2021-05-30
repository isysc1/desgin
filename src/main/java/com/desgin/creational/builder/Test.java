package com.desgin.creational.builder;

/**
 * @author Skow <isysc1@163.com>
 * @description
 * @date 2021/5/27 8:37 下午
 */
public class Test {
    public static void main(String[] args) {
        Dishes dishes = new Dishes.FoodBuilder().buildFood("猪肉").buildCondiment("辣椒").build();
        System.out.println(dishes);
    }
}
