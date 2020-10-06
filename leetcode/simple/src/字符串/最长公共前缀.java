package 字符串;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @Classname 最长公共前缀
 * @Description TODO
 * @Date 2020/10/5 10:46
 * @Created by 94493
 */
public class 最长公共前缀 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        String str = strs[0];
        for(int i=1;i<strs.length;i++){
            int j=0;
            for(;j<str.length()&&j<strs[i].length();j++){
                if(str.charAt(j)!=strs[i].charAt(j)){
                    break;
                }
            }
            str = str.substring(0,j);
            if(str==""){
                return str;//为空串就不用跟后面的项比了
            }
        }
        return str;
    }
}
