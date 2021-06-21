package com.desgin.creational.prototype;

import java.text.MessageFormat;

/**
 * @author Skow <isysc1@163.com>
 * @description
 * @date 2021/5/27 8:37 下午
 */
public class MailUtil {
    public static void sendMail(Mail mail){
        String outputContent = "向{0}用户,邮件地址:{1},邮件内容:{2}";
        System.out.println(MessageFormat.format(outputContent,mail.getName(),mail.getEmailAddress(),mail.getContent()));
    }
    public static void saveOriginMailRecord(Mail mail){
        System.out.println("存储originMail记录,originMail:"+mail.getContent());
    }
}
