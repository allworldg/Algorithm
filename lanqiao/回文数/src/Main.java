import java.util.Scanner;

/**
 * @Classname Main
 * @Description 123321是一个非常特殊的数，它从左边读和从右边读是一样的。
 * 输入一个正整数n， 编程求所有这样的五位和六位十进制数，满足各位数字之和等于n 。
 * @Date 2020/8/18 16:29
 * @Created by 94493
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean flag;
        for (int i = 10000; i < 999999; i++) {
            String str = Integer.toString(i);
            char[] chars = str.toCharArray();
            int length = chars.length;
            flag = true;//判断回文的标志

            for (int l = 0, r = length - 1; l < length / 2; l++, r--) {
                if (chars[l] != chars[r]) {
                    flag = false;
                    break;//遍历这个数字，如果出现不相等则跳出
                }
            }
            if (flag) {
                int sum = 0;
                for (char k : chars) {
                    sum = sum + (int) k - 48;
                }
                if (sum == n) {
                    System.out.println(i);
                }

            }
        }
    }
}


