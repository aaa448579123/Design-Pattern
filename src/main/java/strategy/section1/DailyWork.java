package strategy.section1;

import strategy.section1.DeputyLeader;
import strategy.section1.GaiBangMember;
import strategy.section1.Leader;

/**
 * 这一天总得干点啥（测试类）
 */
public class DailyWork {
    public static void main(String[] args) {
        DailyWork dailyWork = new DailyWork();
        //帮主不能闲着
        Leader leader = new Leader();
        dailyWork.doDailyWork(leader);
        //副帮主也是
        DeputyLeader deputyLeader = new DeputyLeader();
        dailyWork.doDailyWork(deputyLeader);
        //又是收获满满的一天
        System.out.println("今呀今个真高兴");
    }

    /**
     * 每日丐帮成员每天都需要把自己的所有事情都做一遍
     * @param member
     */
    private void doDailyWork(GaiBangMember member){
        member.beg();
        member.recruit();
    }
}
