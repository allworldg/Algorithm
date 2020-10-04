package 字符串;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @Classname 字符串中的第一个唯一字符
 * @Description TODO
 * @Date 2020/10/3 21:01
 * @Created by 94493
 */
public class 字符串中的第一个唯一字符 {
    public int firstUniqChar(String s) {
        HashMap<String,Integer> hashMap = new HashMap<>();
        int index = -1;
        for(int i=0;i<s.length();i++){
            String s1 = s.substring(i,i+1);
            hashMap.put(s1,hashMap.getOrDefault(s1,0)+1);
        }

        for(int i=0;i<s.length();i++){
            if(hashMap.get(s.substring(i,i+1))==1){
                return i;
            }
        }
        return -1;
    }
}
