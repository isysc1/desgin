
package com.desgin.structural.adapter.demo2;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

/**
 * @author Skow <isysc1@163.com>
 * @description
 * @date 2021/6/16 8:16 下午
 */
@Data
public class ChannelLoanContext {

    /**
    * 放款金额
    */
    private BigDecimal loanAmount;

    /**
     * 放款时间
     */
    private Date loanTime;

    /**
    * 渠道编号
    */
    private String channelNo;
}
