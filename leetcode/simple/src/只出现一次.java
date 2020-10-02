import java.util.Arrays;
import java.util.HashMap;

/**
 * @Classname 只出现一次
 * @Description TODO
 * @Date 2020/10/1 23:28
 * @Created by 94493
 */
public class 只出现一次 {
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        System.out.println(singleNumber(arr));

    }
    public static int singleNumber(int[] nums) {
        int count=0;
        for(int i:nums){
            count^=i;
        }
        return count;
    }

    public static int singleNumber2(int[] nums){
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i:nums){
            Integer num = hashMap.get(i);
            num = num == null ? 1:++num;
            hashMap.put(i,num);
        }
        for(int i:hashMap.keySet()){
            Integer num = hashMap.get(i);
            if(num == 1){
                return i;
            }
        }
        return -1;
    }
}
