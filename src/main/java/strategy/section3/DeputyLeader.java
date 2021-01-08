package strategy.section3;

import strategy.section3.interfaces.impl.begImpl.NoBeg;
import strategy.section3.interfaces.impl.payImpl.NeedPay;
import strategy.section3.interfaces.impl.practiceImpl.XiangLongPractice;

/**
 * 副帮主 地位仅次于帮主
 */
public class DeputyLeader extends GaiBangMember {
    public DeputyLeader(){
        this.beg = new NoBeg();
        this.practice = new XiangLongPractice();
    }

    @Override
    public void before() {
        System.out.println("我是副帮主，权限也很高，但是得交钱");
    }
}
