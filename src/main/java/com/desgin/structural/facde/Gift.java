package com.desgin.structural.facde;

/**
 * @author isysc1@163.com
 * @date 2020/7/11
 */
public class Gift {
    private String name;

    public Gift(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Gift{" +
                "name='" + name + '\'' +
                '}';
    }
}
