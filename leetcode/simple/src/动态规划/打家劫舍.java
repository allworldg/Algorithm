package 动态规划;

import java.util.logging.Level;

/**
 * @Classname 打家劫舍
 * @Description TODO
 * @Date 2020/10/6 17:05
 * @Created by 94493
 */
public class 打家劫舍 {
    public int rob(int[] nums) {
        if(nums.length==0 || nums == null){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        int[] dp = new int[nums.length];
        dp[0]  = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++){
            dp[i] = Math.max(dp[i-2]+nums[i],dp[i-1]);
        }
        return dp[dp.length-1];
    }
}
