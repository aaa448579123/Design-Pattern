package strategy.section4.interfaces.impl.begImpl;

import strategy.section4.interfaces.Beg;

/**
 * 不乞讨
 */
public class NoBeg implements Beg {

    public void doBeg() {
        System.out.println("我不去乞讨");
    }
}
