package 其他;

import java.sql.SQLOutput;

/**
 * @Classname 颠倒二进制位
 * @Description TODO
 * @Date 2020/10/7 20:50
 * @Created by 94493
 */
public class 颠倒二进制位 {
    public static void main(String[] args) {
        reverseBits(2);
    }
    public static int reverseBits(int n) {
        int number = 0;
        for(int i=0;i<32;i++){
            number = (number<<1)+(n&1);
            n>>=1;
        }
        return number;
    }
}
