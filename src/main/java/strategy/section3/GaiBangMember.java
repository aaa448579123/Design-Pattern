package strategy.section3;

import strategy.section3.interfaces.Beg;
import strategy.section3.interfaces.Pay;
import strategy.section3.interfaces.Practice;
import strategy.section3.interfaces.impl.begImpl.NoBeg;
import strategy.section3.interfaces.impl.payImpl.NeedPay;
import strategy.section3.interfaces.impl.practiceImpl.NoPractice;

/**
 * 丐帮成员的标志 是丐帮成员都要做下面的事
 */
public abstract class GaiBangMember {

    //策略模式的核心 接口类定义
    public Beg beg;
    public Practice practice;
    public Pay pay;

    public GaiBangMember(){
        this.beg = new NoBeg();
        this.practice = new NoPractice();
        this.pay = new NeedPay();
    }

    /**
     * 乞讨 为了生存！
     */
    public void beg(){
        beg.doBeg();
    }

    /**
     * 修炼武功 成为天下第一
     */
    public void practice(){
        practice.doPractice();
    }

    /**
     * 招人 为了发展！
     */
    public void recruit(){
        System.out.println("来来来，丐帮招人了！！！");
    }

    /**
     * 交帮费 为了丐帮！
     */
    public void pay(){
        pay.doPay();
    }

    /**
     * 今天的全部工作
     */
    public void doToday(){
        System.out.println();
        before();
        beg();
        practice();
        recruit();
        pay();
        System.out.println();
    }

    /**
     * 工作前干点啥 这里用了模板模式
     */
    public void before() {

    }
}
