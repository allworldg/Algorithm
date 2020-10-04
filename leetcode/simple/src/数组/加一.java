package 数组;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Classname 数组.加一
 * @Description TODO
 * @Date 2020/10/2 10:48
 * @Created by 94493
 */
public class 加一 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
    public static int[] plusOne(int[] digits) {
        boolean flag = false;
        digits[digits.length-1]++;
        if(digits[digits.length-1]==10){
            flag=true;
            digits[digits.length-1]=0;
        }
        for(int i=digits.length-2;i>=0;i--){
            if(flag==true){
                digits[i]++;
            }
            if(digits[i]==10){
                digits[i]=0;
                flag=true;
            }else {
                flag = false;
            }
        }

        if(flag==true){
            int[] arr = new int[digits.length+1];
            arr[0] =1;
            for(int i=0;i<digits.length;i++){
                arr[i+1] = digits[i];
            }
            return arr;
        }

        return digits;
    }//思维僵硬

    public static int[] plusOne2(int[] digits){//进位需要想到除以10判断余数的情况，
        // 如果进位后余数不为0说明不会再进位，可以直接停止
            for(int i=digits.length-1;i>=0;i--){
                digits[i]++;
                digits[i]%=10;
                if(digits[i]%10!=0){

                    return digits;//没有进位 可以直接返回
                }
            }
            int[] arr = new int[digits.length+1];
            arr[0] = 1;
            for(int i=0;i<digits.length;i++){
                arr[i+1] = digits[i];
            }
            return arr;
    }
}
