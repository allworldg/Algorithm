import java.util.Scanner;

/**
 * @Classname Main
 * @Description 　1221是一个非常特殊的数，它从左边读和从右边读是一样的，编程求所有这样的四位十进制数。
 * @Date 2020/8/18 17:49
 * @Created by 94493
 */
public class Main {
    public static void main(String[] args) {
        boolean flag;
        for (int i = 1000; i <= 9999; i++) {
            flag = true;
            char[] ch = Integer.toString(i).toCharArray();
            int length = ch.length;
            for (int l = 0, r = length - 1; l < length / 2; l++, r--) {
                if (ch[l] != ch[r]) {
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println(i);
            }
        }
    }
}
