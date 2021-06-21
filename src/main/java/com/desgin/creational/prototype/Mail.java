package com.desgin.creational.prototype;

import lombok.Data;

/**
 * @author Skow <isysc1@163.com>
 * @description
 * @date 2021/5/27 8:37 下午
 */
@Data
public class Mail implements Cloneable{
    private String name;
    private String emailAddress;
    private String content;
    public Mail(){
        System.out.println("Mail 类开始构造");
    }

    @Override
    public String toString() {
        return "Mail{" +
                "name='" + name + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", content='" + content + '\'' +
                '}'+super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("克隆方法启动");
        return super.clone();
    }
}
