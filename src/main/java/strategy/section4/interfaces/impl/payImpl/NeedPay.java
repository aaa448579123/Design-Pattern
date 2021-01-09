package strategy.section4.interfaces.impl.payImpl;

import strategy.section4.interfaces.Pay;

public class NeedPay implements Pay {
    public void doPay() {
        System.out.println("帮主，这是我的帮费");
    }
}
