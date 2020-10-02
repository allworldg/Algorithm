import java.util.Arrays;
import java.util.HashMap;
import java.util.regex.Pattern;

/**
 * @Classname 两个数组的交集
 * @Description TODO
 * @Date 2020/10/2 9:21
 * @Created by 94493
 */
public class 两个数组的交集 {
    public static void  main(String[] args) {
        int[] arr = {1,2,2,1};
        int[] arr1 = {2,2};

        intersect(arr,arr1);
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] news = new int[Math.min(nums1.length,nums2.length)];
        int i=0;
        int j=0;
        int index = 0;
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]==nums2[j]){
                news[index++] = nums1[i];
                i++;
                j++;
            }else if(nums1[i]<nums2[j]){
                i++;
            }else{
                j++;
            }
        }

        return news;

    }

    public static int[] intersect2(int[] nums1, int[] nums2){
        if(nums1.length>nums2.length){
            return intersect2(nums2,nums1);
        }

        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for(int i:nums1){
            Integer count=hashMap.getOrDefault(i,0)+1;
            hashMap.put(i,count);
        }

        int[] arr = new int[nums1.length];
        int index = 0;

        for(int i:nums2){
            Integer count = hashMap.getOrDefault(i,0);
            if(count>0){//大于0说明之前出现过
                arr[index++] = i;
                count--;//重复一组就-1次出现
            }
            if(count>0){//-1还大于0，说明之前还有出现，存回hashmap
                hashMap.put(i,count);
            }else {
                hashMap.remove(i);//-1等于0，说明不会再有重复的，直接移除省空间
            }

        }

        return Arrays.copyOfRange(arr,0,index);//之前没想过，防止数组后续有多余的0;
    }
}
