
package com.desgin.structural.bridge;

import java.math.BigDecimal;

/**
 * @author Skow <isysc1@163.com>
 * @description
 * @date 2021/6/23 9:45 下午
 */
public class PayCypher implements IPayType{

    @Override
    public void payTypeCheck() {
        System.out.println("密码支付校验通过");
    }

    @Override
    public void pay(BigDecimal amount) {
        System.out.println("付款 " + amount);
    }
}
