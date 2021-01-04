package strategy.section1;

/**
 * 这一天总得干点啥（测试类）
 */
public class DailyWork {
    public static void main(String[] args) {
        //帮主不能闲着
        Leader leader = new Leader();
        leader.beg();
        leader.recruit();
        //副帮主也是
        DeputyLeader deputyLeader = new DeputyLeader();
        deputyLeader.beg();
        deputyLeader.recruit();
        //又是收获满满的一天
        System.out.println("今呀今个真高兴");
    }
}
