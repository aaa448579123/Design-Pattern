package observer.section1;

/**
 * 书籍
 */
public class Book {
    //武功
    private String wugong;
    //经文
    private String jingwen;

    public String getJingwen() {
        return jingwen;
    }

    public String getWugong() {
        return wugong;
    }

    /**
     * 设置书籍
     */
    public void setBook(String wugong,String jignwen){
        this.wugong = wugong;
        this.jingwen = jignwen;
    }
}
