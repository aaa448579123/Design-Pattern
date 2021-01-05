package strategy.section2;

/**
 * 丐帮成员的标志 是丐帮成员都要做下面的事
 */
public class GaiBangMember {

    /**
     * 乞讨 为了生存！
     */
    public void beg(){
        System.out.println("大爷给点钱吧");
    }

    /**
     * 招人 为了发展！
     */
    public void recruit(){
        System.out.println("来来来，加入丐帮，包你有吃有喝");
    }

    /**
     * 交帮费 为了丐帮！
     */
    public void pay(){
        System.out.println("帮主，这是我的帮费");
    }
}
