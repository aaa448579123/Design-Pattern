package strategy.section4.interfaces.impl.payImpl;

import strategy.section4.interfaces.Pay;

public class NoPay implements Pay {
    public void doPay() {
        System.out.println("我不需要交钱");
    }
}
