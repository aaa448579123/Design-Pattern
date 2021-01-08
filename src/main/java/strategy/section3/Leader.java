package strategy.section3;


import strategy.section3.interfaces.impl.begImpl.NoBeg;
import strategy.section3.interfaces.impl.payImpl.NoPay;
import strategy.section3.interfaces.impl.practiceImpl.DaGouPractice;

/**
 * 帮主 全帮权力最大
 */
public class Leader extends GaiBangMember {
    public Leader (){
        beg = new NoBeg();
        practice = new DaGouPractice();
        pay = new NoPay();
    }

    @Override
    public void before() {
        System.out.println("我是帮主，想干啥干啥");
    }
}
