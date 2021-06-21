/**
 * Zhejiang Yunrong Innovation Technology Co. Ltd
 * Copyright 2015-2021 | www.yunrong.cn . All rights reserved .
 */
package com.desgin.structural.adapter.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Skow <yangsc@yunrong.cn>
 * @description
 * @date 2021/6/16 8:20 下午
 */
@Service
public class B2ChannelExecutor implements ChannelAdapterExecutor {

    @Autowired
    private B2LoanService b2LoanService = new B2LoanService();

    /**
     * 放款
     *
     * @param context
     * @return
     */
    @Override
    public boolean loan(ChannelLoanContext context) {
        b2LoanService.b2Loan(context);
        return true;
    }
}
