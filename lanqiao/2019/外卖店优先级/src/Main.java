import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/8/28 16:41
 * @Created by 94493
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();//外卖店数量
        int M = scanner.nextInt();//M条订单
        int T = scanner.nextInt();//T时刻
        HashMap hashMap = new HashMap();
        int count = 0;
        int[][] a = new int[N+1][T+1];//二维数组存放
        int[] b = new int[N+1];//优先级
        for(int i=1;i<=M;i++){
            int t = scanner.nextInt();
            int m = scanner.nextInt();

            a[m][t]++;
        }

        for(int i=1;i<=N;i++){
            for(int j=1;j<=T;j++){
                if(a[i][j]>0){
                    b[i]=b[i]+a[i][j]*2;
                }
                else{
                    b[i]=Integer.max(0,b[i]-1);
                }

                if(b[i]>5){
                    hashMap.put(i,1);
                }

                if(b[i]<=3&&hashMap.containsKey(i)){
                    hashMap.remove(i);
                }
            }
        }

        for(int i=1;i<=N;i++){
            if(b[i]>5){
                count++;
            }
        }
        System.out.println(count);



    }
}
