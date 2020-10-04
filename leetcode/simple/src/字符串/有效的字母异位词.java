package 字符串;

import java.util.Arrays;

/**
 * @Classname 有效的字母异位词
 * @Description TODO
 * @Date 2020/10/3 21:22
 * @Created by 94493
 */
public class 有效的字母异位词 {
    public static void main(String[] args) {
        isAnagram1("a","b");
    }
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        Arrays.sort(sc);
        Arrays.sort(tc);

        for (int i = 0; i < sc.length; i++) {
            if (sc[i] != tc[i]) {
                return false;
            }
        }

        return true;
    }

    public static boolean  isAnagram1(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] chars = new int[256];
        for (int i = 0; i < s.length(); i++) {
            int sIndex = s.charAt(i);
            int tIndex = t.charAt(i);
            chars[sIndex]++;
            chars[tIndex]--;
        }

        for(int i=0;i<chars.length;i++){
            if(chars[i]!=0){
                return false;
            }
        }
        return true;
    }
}
