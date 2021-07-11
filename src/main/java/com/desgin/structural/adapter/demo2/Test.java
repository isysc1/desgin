
package com.desgin.structural.adapter.demo2;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author Skow <isysc1@163.com>
 * @description
 * @date 2021/6/16 8:36 下午
 */
public class Test {
    public static void main(String[] args) {

        ChannelLoanContext a1ChannelLoanContext = new ChannelLoanContext();
        a1ChannelLoanContext.setChannelNo("A1");
        a1ChannelLoanContext.setLoanAmount(new BigDecimal("123"));
        a1ChannelLoanContext.setLoanTime(new Date());
        ChannelAdapterExecutor a1ChannelAdapterExecutor = new A1ChannelExecutor();
        a1ChannelAdapterExecutor.loan(a1ChannelLoanContext);


        ChannelLoanContext b2ChannelLoanContext = new ChannelLoanContext();
        b2ChannelLoanContext.setChannelNo("A1");
        b2ChannelLoanContext.setLoanAmount(new BigDecimal("123"));
        b2ChannelLoanContext.setLoanTime(new Date());
        ChannelAdapterExecutor b2ChannelAdapterExecutor = new B2ChannelExecutor();
        b2ChannelAdapterExecutor.loan(b2ChannelLoanContext);

    }
}
