package 数组;

/**
 * @Classname 数组.买卖股票
 * @Description TODO
 * @Date 2020/10/1 16:54
 * @Created by 94493
 */
public class 买卖股票 {
    public int maxProfit(int[] prices) {
        if(prices.length==0||prices==null){
            return 0;
        }

        int price =0;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i]<prices[i+1]){
                price+=prices[i+1]-prices[i];
            }
        }
        return price;
    }
}
