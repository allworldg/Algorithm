package 数组;

/**
 * @Classname 数组.移动零
 * @Description TODO
 * @Date 2020/10/2 11:30
 * @Created by 94493
 */
public class 移动零 {
    public void moveZeroes(int[] nums) {//双指针,一个快一个慢
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
    }
}
