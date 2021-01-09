package strategy.section4;

import strategy.section4.interfaces.Beg;
import strategy.section4.interfaces.Practice;
import strategy.section4.interfaces.impl.begImpl.NoBeg;

/**
 * 普通帮众 但是我有钱 不乞讨
 */
public class CommonMemberNoBeg extends GaiBangMember {
    public CommonMemberNoBeg(Practice practice){
        this.beg = new NoBeg();
        this.practice = practice;
    }

    @Override
    public void before() {
        System.out.println("我是普通帮众，但是我有钱，不乞讨");
    }
}
