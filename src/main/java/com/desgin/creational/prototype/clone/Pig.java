package com.desgin.creational.prototype.clone;

import java.util.Date;

import lombok.Data;

/**
 * @author Skow <isysc1@163.com>
 * @description
 * @date 2021/5/27 8:37 下午
 */
@Data
public class Pig implements Cloneable {
    private String name;
    private Date birthday;

    public Pig(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Pig pig = (Pig) super.clone();

        //深克隆
        pig.birthday = (Date) pig.birthday.clone();
        return pig;
    }

    @Override
    public String toString() {
        return "Pig{" + "name='" + name + '\'' + ", birthday=" + birthday + '}' + super.toString();
    }
}
