package 其他;

import java.util.Arrays;

/**
 * @Classname 缺失的数
 * @Description TODO
 * @Date 2020/10/7 22:54
 * @Created by 94493
 */
public class 缺失的数 {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int number = 0;
        int i = 0;
        for(;i<nums.length;i++){
            if(nums[i]!=i){
                number = i;
                break;
            }
        }
        if(i==nums.length){
            number = i;
        }
        return number;
    }

    public int missingNumber1(int[] nums){
        int n = nums.length;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }

        return (1+n)*n/2-sum;
    }
}
