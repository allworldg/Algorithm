/**
 * @Classname 约瑟夫问题
 * @Description TODO
 * @Date 2020/10/27 20:26
 * @Created by 94493
 */
public class 约瑟夫问题 {
    public static void main(String[] args) {
        System.out.println(solve(2,3));
    }

    /**
     * n个人，m号 out
     *递推公式  f（n，m） = f(f(n-1,m)+3)%n
     * @param n
     * @param m
     * @return 胜利者的下标(从0开始 ）
     */
    public static int solve(int n, int m) {
        int p =0;
        for(int i=2;i<=n;i++){
            p = (p+m)%i;
        }
        return p;
    }
}
