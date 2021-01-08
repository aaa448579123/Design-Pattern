package strategy.section3.interfaces.impl.payImpl;

import strategy.section3.interfaces.Pay;

public class NeedPay implements Pay {
    public void doPay() {
        System.out.println("帮主，这是我的帮费");
    }
}
