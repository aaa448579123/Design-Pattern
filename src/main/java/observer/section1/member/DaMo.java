package observer.section1.member;

import observer.section1.Book;

/**
 * 达摩院弟子
 */
public class DaMo {
    public void doExercise(Book book){
        System.out.println("我是达摩院弟子");
        System.out.println("我练习："+book.getWugong());
    }
}
