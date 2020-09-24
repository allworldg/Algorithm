/**
 * @Classname Main
 * @Description 今盒子里有n个小球，A、B两人轮流从盒中取球，每个人都可以看到另一个人取了多少个，也可以看到盒中还剩下多少个，并且两人都很聪明，不会做出错误的判断。
 * 我们约定：
 * 每个人从盒子中取出的球的数目必须是：1，3，7或者8个。
 * 轮到某一方取球时不能弃权！
 * A先取球，然后双方交替取球，直到取完。
 * 被迫拿到最后一个球的一方为负方（输方）
 * 请编程确定出在双方都不判断失误的情况下，对于特定的初始球数，A是否能赢？
 * @Date 2020/9/17 18:37
 * @Created by 94493
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(pick(1)?1:0);
        System.out.println(pick(2)?1:0);
        System.out.println(pick(10)?1:0);
        System.out.println(pick(18)?1:0);
    }

    public static boolean pick(int n){
        if(n==0){
            return true;//如果到自己取的是0个，说明对方取走了最后一个，自己赢
        }
        if(n>=1&&!pick(n-1))//如果自己尝试取一个的前提下对方没赢，则自己赢
            return true;
        if(n>=3&&!pick(n-3))//如果自己尝试取3个的前提下对方没赢，则自己赢，以此类推
            return true;
        if(n>=7&&!pick(n-7))
            return true;
        if(n>=8&&!pick(n-8))
            return true;

        return false;
    }
}
