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
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();//此处是为了不让下面的nextline读取到上面nextint的回车

        for (int i = 1; i <= n; i++) {
            String result = new BigInteger(sc.nextLine(),16).toString(8);
            System.out.println(result);
        }


    }

}
