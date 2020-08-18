import java.math.BigInteger;
import java.util.Scanner;

/**
 * @Classname Main
 * @Description 给定n个十六进制正整数，输出它们对应的八进制数。
 * @Date 2020/8/18 10:32
 * @Created by 94493
 */
public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        sc.nextLine();//此处是为了不让下面的nextline读取到上面nextint的回车
//
//        for (int i = 1; i <= n; i++) {
//            String result = new BigInteger(sc.nextLine(),16).toString(8);
//            System.out.println(result);

        Scanner sc = new Scanner(System.in);
        decimaltohex(sc.nextInt());
    }


    /**
     * 十六进制转换成十进制
     *
     * @param n
     */
    public static void hextodecimal(String n) {
        String result = new BigInteger(n, 16).toString(10);
        System.out.println(result);

    }

    /**
     * 十进制转换十六进制
     * @param n
     */
    public static void decimaltohex(int n){
        String result = Integer.toHexString(n).toUpperCase();
        System.out.println(result);
    }

}
