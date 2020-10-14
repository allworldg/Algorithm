package 动态规划;

/**
 * @Classname 小孩爬楼梯
 * @Description TODO
 * @Date 2020/10/6 10:20
 * @Created by 94493
 */
public class 小孩爬楼梯 {
    public static void main(String[] args) {
        System.out.println(climbStairs1(4));
    }
    /**
     * 递归
     * @param n
     * @return
     */
    public static int climbStairs(int n) {
        if(n==1||n==2||n==0){
            return n;
        }
        return climbStairs(n-1)+climbStairs(n-2);
    }

    public static int climbStairs1(int n){
        if(n==1||n==2||n==0){
            return n;
        }
        int a = 1;
        int b = 2;
        for(int i=3;i<=n;i++){
            int temp = a+b;
            a =b;
            b =temp;
        }
        return b;
    }
}
