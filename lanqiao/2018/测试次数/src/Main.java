import java.util.Random;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/8/30 16:45
 * @Created by 94493
 */
public class Main {
    public static void main(String[] args) {
        int n = 1000;
        int m = 3;
        int[][] dp = new int[1005][4];
        for(int i=1;i<=n;++i){
            for(int j=1;j<=m;++j){
                dp[i][j] = dp[i - 1][j] + dp[i - 1][j - 1] + 1;
            }
            if(dp[i][m]>=n){
                System.out.println(i);
                break;
            }
        }
    }
}


