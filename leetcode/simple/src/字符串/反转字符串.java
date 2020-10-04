package 字符串;

/**
 * @Classname 反转字符串
 * @Description TODO
 * @Date 2020/10/3 17:01
 * @Created by 94493
 */
public class 反转字符串 {
    public void reverseString(char[] s) {
        for(int i=0;i<s.length/2;i++){
            char temp = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] = temp;
        }
    }
}
