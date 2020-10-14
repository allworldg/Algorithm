package 动态规划;

/**
 * @Classname 买卖股票最佳时机
 * @Description TODO
 * @Date 2020/10/6 11:18
 * @Created by 94493
 */
public class 买卖股票最佳时机 {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        maxProfit(arr);
    }
    public static int maxProfit(int[] prices) {
       int min = Integer.MAX_VALUE;
       int maxProfit = 0;
       for(int i=0;i<prices.length;i++){
           if(prices[i]<min){
               min = prices[i];
           }else if(maxProfit<prices[i]-min){
               maxProfit = prices[i]-min;
           }
       }
       return maxProfit;
    }
}
