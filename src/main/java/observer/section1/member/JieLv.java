package observer.section1.member;

import observer.section1.Book;

/**
 * 戒律院弟子
 */
public class JieLv {
    public void doExercise(Book book){
        System.out.println("我是戒律院弟子");
        System.out.println("我练习："+book.getWugong());
    }
}
