package 字符串;

import java.util.Arrays;

/**
 * @Classname 验证回文串
 * @Description TODO
 * @Date 2020/10/4 10:11
 * @Created by 94493
 */
public class 验证回文串 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("0p"));
    }
    public static boolean isPalindrome(String s) {
        if(s.length()==0||s==null){
            return true;
        }
        s = s.toLowerCase();
        char[] chars1 = new char[s.length()];
        char[] chars2 = new char[s.length()];
        int index1 = 0;
        int index2 = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            char c1 = s.charAt(s.length()-1-i);
            if((c>='a'&&c<='z')||(c>='A'&&c<='Z')||(c>='0'&&c<='9')){
                chars1[index1] = c;
                index1++;
            }
            if((c1>='a'&&c1<='z')||(c1>='A'&&c1<='Z')||(c>='0'&&c<='9')){
                chars2[index2] = c1;
                index2++;
            }
        }

        return Arrays.equals(chars1,chars2);
    }//自创，复杂，将首尾的字符放进两个数组，然后比较。

    public static boolean isPalindrome1(String s){
        StringBuffer stringBuffer1 = new StringBuffer();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                stringBuffer1.append(Character.toLowerCase(c));
            }
        }
        StringBuffer stringBuffer1_rev = new StringBuffer(stringBuffer1).reverse();
        return stringBuffer1.toString().equals(stringBuffer1_rev.toString());
    }

    public static boolean isPalindrome2(String s){
        StringBuffer stringBuffer = new StringBuffer();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                stringBuffer.append(Character.toLowerCase(c));
            }
        }

        int left = 0;
        int right = stringBuffer.length()-1;
        while(left<right){
            if(stringBuffer.charAt(left)!=stringBuffer.charAt((right))){
                return false;
            }
            right--;
            left++;
        }
        return true;
    }//双指针

    public static boolean isPalindrome3(String s){//原地双指针

        int left = 0;
        int right = s.length()-1;
        while(left<right){
            while(left<right&&!Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }

            while(left<right&&!Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }

            if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
                return false;
            }
            right--;
            left++;
        }
        return true;
    }
}
