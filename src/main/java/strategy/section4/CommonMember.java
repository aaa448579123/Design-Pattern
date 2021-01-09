package strategy.section4;

import strategy.section4.interfaces.Beg;
import strategy.section4.interfaces.Practice;

/**
 * 普通帮众
 */
public class CommonMember extends GaiBangMember {
    public CommonMember(Beg beg, Practice practice){
        this.beg = beg;
        this.practice = practice;
    }

    @Override
    public void before() {
        System.out.println("我是普通帮众，能选择的比较少");
    }
}
