
package com.desgin.structural.bridge;

import java.math.BigDecimal;

/**
 * @author Skow <isysc1@163.com>
 * @description
 * @date 2021/6/23 12:57 下午
 */
public interface IPayType {

    void payTypeCheck();

    void pay(BigDecimal amount);
}
