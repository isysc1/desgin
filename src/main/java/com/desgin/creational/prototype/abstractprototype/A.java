package com.desgin.creational.prototype.abstractprototype;

/**
 * @author Skow <isysc1@163.com>
 * @description
 * @date 2021/5/27 8:37 下午
 */
public abstract class A implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
