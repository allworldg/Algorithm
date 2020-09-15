import java.util.Scanner;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/9/14 16:32
 * @Created by 94493
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N  = scanner.nextInt();//N个数字
        int K = scanner.nextInt();//k倍

        int[] arr = new int[N+1];
        for(int i=1;i<=N;i++){
            arr[i] = scanner.nextInt();
        }
        int count=0;
        for(int i=1;i<=N;i++){
            for(int j=i;j<=N;j++){
                if((arr[j]-arr[i-1])%K==0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
