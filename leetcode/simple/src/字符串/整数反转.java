package 字符串;

/**
 * @Classname 整数反转
 * @Description TODO
 * @Date 2020/10/3 17:20
 * @Created by 94493
 */
public class 整数反转 {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));

    }
    public static  int reverse(int x) {
        if(x>Integer.MAX_VALUE||x<Integer.MIN_VALUE){
            return 0;
        }
        int number = 0;
        while(x!=0){
            int remainder = x%10;//求出每一位数字
            x=x/10;
            if(number>Integer.MAX_VALUE/10||(number==Integer.MAX_VALUE/10&&remainder>Integer.MAX_VALUE-number)){
                return 0;
            }
            if(number<Integer.MIN_VALUE/10||(number==Integer.MIN_VALUE/10&&remainder<Integer.MIN_VALUE-number)){
                return 0;
            }
            number = number*10+remainder;
        }

        return number;
    }
}
