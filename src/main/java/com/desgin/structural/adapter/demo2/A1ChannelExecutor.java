
package com.desgin.structural.adapter.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Skow <isysc1@163.com>
 * @description
 * @date 2021/6/16 8:20 下午
 */
@Service
public class A1ChannelExecutor implements ChannelAdapterExecutor {

    private A1LoanService a1LoanService = new A1LoanService();

    /**
     * 放款
     *
     * @param context
     * @return
     */
    @Override
    public boolean loan(ChannelLoanContext context) {
        a1LoanService.a1Loan(context);
        return true;
    }
}
