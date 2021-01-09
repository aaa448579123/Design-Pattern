package strategy.section4;


import strategy.section4.interfaces.impl.begImpl.EestBeg;
import strategy.section4.interfaces.impl.begImpl.SouthBeg;
import strategy.section4.interfaces.impl.practiceImpl.NoPractice;
import strategy.section4.interfaces.impl.practiceImpl.XiaoYaoPractice;

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
        //普通弟子
        GaiBangMember member = new CommonMember(new EestBeg(),new XiaoYaoPractice());
        member.doToday();
        //有钱弟子
        GaiBangMember memberNoBeg = new CommonMemberNoBeg(new NoPractice());
        memberNoBeg.doToday();
        //又是收获满满的一天
        System.out.println("又是收获满满的一天！！");
    }
}
