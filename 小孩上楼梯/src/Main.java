import java.util.Scanner;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/9/25 21:05
 * @Created by 94493
 */
public class Main {
    public static int n;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        System.out.println(fun(0));
    }

    // 1 2 3
    public static int fun(int sum) {
        if (n == sum) {
            return 1;
        }
        if (sum > n) {
            return 0;
        }
        return fun(sum + 1) + fun(sum + 2) + fun(sum + 3);
    }
}
