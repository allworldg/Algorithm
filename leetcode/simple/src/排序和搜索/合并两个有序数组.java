package 排序和搜索;

import java.util.Arrays;

/**
 * @Classname 合并两个有序数组
 * @Description TODO
 * @Date 2020/10/5 21:19
 * @Created by 94493
 */
public class 合并两个有序数组 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {2,5,6};
        merge(arr1,3,arr2,3);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2,0,nums1,m,n);
        Arrays.sort(nums1);

    }

    /**
     * 由于数组是有序的，所以应该用双指针，从前往后遍历两个数组
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public static void merge1(int[] nums1, int m, int[] nums2, int n){
        int[] nums1_copy = new int[nums1.length];
        System.arraycopy(nums1,0,nums1_copy,0,m);

        int s1=0,s2=0,s3=0;
        while(s2<m&&s3<n){
            nums1[s1++] = (nums1_copy[s2]<nums2[s3])? nums1_copy[s2++]:nums2[s3++];
        }

        while(s2<m){
            nums1[s1++] = nums1_copy[s2++];
        }
        while(s3<n){
            nums1[s1++] = nums2[s3++];
        }
    }

    /**
     * 从后往前双指针可以原地，不用浪费空间
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public static void merge2(int[] nums1, int m, int[] nums2, int n){
        int p = m+n-1;//找到从结尾位置开始
        int p1 = m-1;
        int p2 = n-1;

        while(p1>=0&&p2>=0){
            nums1[p--] = (nums1[p1]>nums2[p2])?nums1[p1--]:nums2[p2--];
        }

        while(p1>=0){
            nums1[p--] = nums1[p1--];
        }
        while(p2>=0){
            nums1[p--] = nums2[p2--];
        }
    }
}
