import java.util.Arrays;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/9/1 17:23
 * @Created by 94493
 */
public class Main {
    public static void main(String[] args) {
        int[] coins = {1,2};
        int amount = 13;
        System.out.println(solve(coins,amount));
    }

    /**
     * 输入硬币种类数组，输入金额，返回硬币数
     * @param coins
     * @param amount
     * @return
     */
    public static int solve(int coins[],int amount){
        int[] dp = new int[amount+1];
        Arrays.fill(dp,amount+1);//amount+1只是为了让数组每个初始值尽可能大，可以使用Max
        dp[0] = 0;//0块需要的硬币数肯定只是0
        for(int i=1;i<=amount;i++){//i指钱数为1，2，3，4，。。块的时候
            for(int j=0;j<coins.length;j++){
                if(i-coins[j]>=0){
                    dp[i] = Math.min(dp[i],dp[i-coins[j]]+1);//状态转移方程
                }
            }
        }
        return dp[amount]>amount ? -1:dp[amount];//如果amount块对应的大小大于钱币数说明没动过，也就是没有匹配，所以返回-1
    }
}


