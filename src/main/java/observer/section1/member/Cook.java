package observer.section1.member;

import observer.section1.Book;

/**
 * 火头工（做饭的）
 */
public class Cook {
    public void doExercise(Book book){
        System.out.println("我是火头工");
        System.out.println("我学习："+book.getJingwen());
    }
}
