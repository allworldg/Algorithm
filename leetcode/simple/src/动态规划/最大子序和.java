package 动态规划;

/**
 * @Classname 最大子序和
 * @Description TODO
 * @Date 2020/10/6 16:38
 * @Created by 94493
 */
public class 最大子序和 {
    public int maxSubArray(int[] nums) {
        int pre = 0, maxAns = nums[0];
        for (int x : nums) {
            pre = Math.max(pre + x, x);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;

    }
}
