package 数组;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @Classname 数组.两数之和
 * @Description TODO
 * @Date 2020/10/2 16:30
 * @Created by 94493
 */
public class 两数之和 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4};
        System.out.println(Arrays.toString(twoSum(arr, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        return arr;
    }

    public static int[] twoSum2(int[] nums, int target) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hashMap.containsKey(target-nums[i])){
                return new int[]{hashMap.get(target-nums[i]),i};
            }else {
                hashMap.put(nums[i],i);
            }
        }
        throw new IllegalArgumentException("null");
    }
}
