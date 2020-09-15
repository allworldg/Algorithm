import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.Scanner;

/**
 * @Classname Main
 * @Description 采用暴力
 * @Date 2020/9/14 9:06
 * @Created by 94493
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();//N块巧克力
        int K = scanner.nextInt();//K个小朋友
        int[] wid = new int[N+1];
        int[] high = new int[N+1];

        for(int i=1;i<=N;i++){
            high[i] = scanner.nextInt();
            wid[i] = scanner.nextInt();
        }

        for(int i=1;i<=10000;i++){
            int sum = 0;
            for(int j=1;j<=N;j++){
                    sum = sum+wid[j]*high[j]/(i*i);
            }
            if(sum<K){
                System.out.println(i-1);
                return;
            }
        }

    }
}
