package strategy.section3.interfaces.impl.payImpl;

import strategy.section3.interfaces.Pay;

public class NoPay implements Pay {
    public void doPay() {
        System.out.println("我不需要交钱");
    }
}
