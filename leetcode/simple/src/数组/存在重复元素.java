package 数组;

import java.nio.channels.InterruptedByTimeoutException;
import java.util.HashSet;

/**
 * @Classname 数组.存在重复元素
 * @Description TODO
 * @Date 2020/10/1 21:11
 * @Created by 94493
 */
public class 存在重复元素 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(!hashSet.add(nums[i])){
                return false;
            }
        }
        return true;
    }
}
