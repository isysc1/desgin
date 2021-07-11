package com.desgin.structural.adapter.demo2;

/**
 * 渠道执行器接口
 * /**
 *
 * @author Skow <isysc1@163.com>
 * @description
 * @date 2021/6/16 8:16 下午
 */
public interface ChannelAdapterExecutor {

    /**
     * 放款
     *
     * @param context
     * @return
     */
    boolean loan(ChannelLoanContext context);
}
