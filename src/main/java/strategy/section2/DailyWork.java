package strategy.section2;

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
        //其他弟子
        CommonMember commonMember = new CommonMember();
        dailyWork.doDailyWork(commonMember);
        //又是收获满满的一天
        System.out.println("又是收获满满的一天");
    }

    /**
     * 每日丐帮成员需要做的事情
     * @param member
     */
    private void doDailyWork(GaiBangMember member){
        //如果是帮主 既不用叫帮费 也不用乞讨 但是要练武
        if (member instanceof Leader){
            Leader leader = (Leader)member;
            leader.practice();
            leader.recruit();
        }
        //其他人还是一样的
        else {
            member.beg();
            member.pay();
            member.recruit();
        }
    }
}
