package observer.section1.member;

import observer.section1.Book;

/**
 * 方丈
 */
public class Master {
    public void doExercise(Book book){
        System.out.println("我是方丈");
        System.out.println("我练习："+book.getWugong());
        System.out.println("我学习："+book.getJingwen());
    }
}
