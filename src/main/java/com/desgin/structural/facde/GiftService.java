package com.desgin.structural.facde;

/**
 * @author isysc1@163.com
 * @date 2020/7/11
 */
public class GiftService {

    /**
     * 因为我们没有注入 Spring 环境，所以这里直接写个构造方法
     */
    private final PayService pointsPaymentService = new PayService();
    private final CheckService checkService = new CheckService();
    private final ShippingService shippingService = new ShippingService();

    public void giftExchange(Gift gift) {
//      校验积分、库存
        if (checkService.isAvaliable(gift)) {
//          支付积分
            if (pointsPaymentService.pay(gift)) {
//              获得单号
                String orderNo = shippingService.shipGift(gift);
                System.out.println("物流已经发出，订单号是 " + orderNo);
            }
        }
    }
}


