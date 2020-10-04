package 数组;

import java.util.Arrays;

/**
 * @Classname 数组.旋转数组
 * @Description TODO
 * @Date 2020/10/1 19:31
 * @Created by 94493
 */
public class 旋转数组 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        rotate2(arr,3);
        System.out.println(Arrays.toString(arr));

    }
    /**
     * 方法一，用额外的数组储存，然后再赋值回去
     * @param nums
     * @param k
     */
    public static int[] rotate1(int[] nums, int k) {
        int[] arr = new int[nums.length];
        for(int i=0;i<arr.length;i++){
            arr[(i+k)%nums.length] = nums[i];
        }

        for(int i=0;i<nums.length;i++){
            nums[i] = arr[i];
        }
        return nums;
    }

    /**
     * 采用反转
     * @param nums
     * @param k
     * @return
     */
    public static void rotate2(int[] nums,int k){
        k=k%nums.length;
         reverse(nums,0,nums.length-1);
         reverse(nums,0,k-1);
         reverse(nums,k,nums.length-1);
    }

    public static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
