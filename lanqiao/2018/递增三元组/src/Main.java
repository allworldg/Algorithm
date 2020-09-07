import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * @Classname Main
 * @Description 给定三个整数数组
 * A = [A1, A2, … AN],
 * B = [B1, B2, … BN],
 * C = [C1, C2, … CN]，
 * 请你统计有多少个三元组(i, j, k) 满足：
 *
 * 1 <= i, j, k <= N
 * Ai < Bj < Ck
 * @Date 2020/9/4 16:48
 * @Created by 94493
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//一行几个
        int[] a = new int[n+1];
        int[] b = new int[n+1];
        int[] c = new int[n+1];
        int count = 0;
        for(int i=1;i<=n;i++){
            a[i] = scanner.nextInt();
        }
        for(int i=1;i<=n;i++){
            b[i] = scanner.nextInt();
        }
        for(int i=1;i<=n;i++){
            c[i] = scanner.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(a[i]>=b[j]){
                    break;
                }
                for(int k=1;k<=n;k++){
                    if(b[j]>=c[k]){
                        break;
                    }
                    count++;
                }
            }
        }

        System.out.println(count);


    }
}
