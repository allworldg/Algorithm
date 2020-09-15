import javax.sound.midi.Soundbank;
import java.util.Scanner;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/9/13 15:26
 * @Created by 94493
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] arr = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            arr[i] = scanner.nextInt();
        }
        int temp = arr[1];
        for (int i = 2; i <= N; i++) {
            temp = gcd(temp, arr[i]);
        }

        if (temp != 1) {
            System.out.println("INF");
            return;
        }

        boolean[] dp = new boolean[10000 + 1];
        dp[0] = true;
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j+arr[i] <= 10000; j++) {
                if (dp[j] == true) {
                    dp[arr[i] + j] = true;
                }
            }
        }
        int count = 0;
        for (int j = 1; j <= 10000; j++) {
            if (dp[j] == false) {
                count++;
            }

        }

        System.out.println(count);


    }

    static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        }

        return gcd(y, x % y);
    }
}
