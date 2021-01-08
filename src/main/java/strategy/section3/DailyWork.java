package strategy.section3;


import strategy.section3.interfaces.impl.begImpl.EestBeg;
import strategy.section3.interfaces.impl.begImpl.SouthBeg;
import strategy.section3.interfaces.impl.practiceImpl.NoPractice;
import strategy.section3.interfaces.impl.practiceImpl.XiaoYaoPractice;

/**
 * 这一天总得干点啥（测试类）
 */
public class DailyWork {
    public static void main(String[] args) {
        System.out.println("新的一天开始了！！");
        //帮主要做的
        GaiBangMember leader = new Leader();
        leader.doToday();
        //副帮主要做的
        GaiBangMember deputyLeader = new DeputyLeader();
        deputyLeader.doToday();
        //其他弟子1
        CommonMember member1 = new CommonMember(new EestBeg(),new XiaoYaoPractice());
        member1.doToday();
        //其他弟子2
        CommonMember member2 = new CommonMember(new SouthBeg(),new NoPractice());
        member2.doToday();
        //又是收获满满的一天
        System.out.println("又是收获满满的一天！！");
    }
}
