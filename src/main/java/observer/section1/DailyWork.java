package observer.section1;

import observer.section1.member.Cook;
import observer.section1.member.DaMo;
import observer.section1.member.JieLv;
import observer.section1.member.Master;

/**
 * 少林派日常（测试类）
 */
public class DailyWork {
    public static void main(String[] args) {
        Book book = new Book();
        book.setBook("拈花指","道德经");
        //设置好武功下面该练习了
        //火头工
        Cook cook = new Cook();
        cook.doExercise(book);
        //达摩院 戒律院弟子
        DaMo daMo = new DaMo();
        daMo.doExercise(book);
        JieLv jieLv = new JieLv();
        jieLv.doExercise(book);
        //方丈
        Master master = new Master();
        master.doExercise(book);
        //结束
        System.out.println("又是辛勤耕耘的一天");
    }
}
