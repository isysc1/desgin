
package com.desgin.structural.bridge;

import java.math.BigDecimal;

/**
 * @author Skow <isysc1@163.com>
 * @description
 * @date 2021/6/23 12:57 下午
 */
public abstract class Pay {

    public IPayType payType;

    public Pay(IPayType payType) {
        this.payType = payType;
    }

    abstract IPayType pay(BigDecimal amount);
}
