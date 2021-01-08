package strategy.section3;

import strategy.section3.interfaces.Beg;
import strategy.section3.interfaces.Practice;
import strategy.section3.interfaces.impl.payImpl.NeedPay;

/**
 * 普通帮众
 */
public class CommonMember extends GaiBangMember{
    public CommonMember(Beg beg, Practice practice){
        this.beg = beg;
        this.practice = practice;
    }

    @Override
    public void before() {
        System.out.println("我是普通帮众，能选择的比较少");
    }
}
