package com.desgin.creational.prototype;

/**
 * @author Skow <isysc1@163.com>
 * @description
 * @date 2021/5/27 8:37 下午
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("原始放款成功模板");
        System.out.println("初始化mail:" + mail);
        for (int i = 0; i < 2; i++) {
            Mail customerMail = (Mail) mail.clone();
            customerMail.setName("用户姓名，我叫张" + i);
            customerMail.setEmailAddress("我叫张" + i + "@qq.com");
            customerMail.setContent("恭喜您，借款成功" + i + "百万，成功");
            MailUtil.sendMail(customerMail);
        }
        MailUtil.saveOriginMailRecord(mail);
    }
}
