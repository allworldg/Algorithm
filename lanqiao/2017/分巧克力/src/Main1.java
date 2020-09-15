import java.util.Scanner;

/**
 * @Classname Main1
 * @Description 二分法
 * @Date 2020/9/14 11:10
 * @Created by 94493
 */
public class Main1 {
    static int[] high;
    static int[] width;
    static int K;//k个小朋友
    static int N;//N个巧克力
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        K = scanner.nextInt();
        high = new int[N+1];
        width = new int[N+1];
        for(int i=1;i<=N;i++){
            high[i] = scanner.nextInt();
            width[i] = scanner.nextInt();
        }

        int low = 1;
        int high = 10000;
        int mid = 0;
        while(low<=high){
            mid = (high+low)/2;
            if(!check(mid)){
                high = mid-1;
            } else {
                low = mid+1;
            }


        }
        System.out.println(low);

    }

    public static boolean check(int lengh) {
        int sum = 0;
        for (int i = 1; i < high.length; i++) {
            sum+=(width[i]*high[i])/(lengh*lengh);
        }
        if(sum>=K){
            return true;
        }
        return false;
    }
}
