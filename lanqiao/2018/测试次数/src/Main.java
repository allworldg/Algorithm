import java.util.Random;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/8/30 16:45
 * @Created by 94493
 */
public class Main {
    public static void main(String[] args) {
        int n = 4;
        int[] arr = new int[n+1];
        for(int i=1;i<arr.length;i++){
            arr[i] = -1;
        }
        System.out.println(fab2(n,arr));
    }

    public static int fab1(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return fab1(n - 1) + fab1(n - 2);
    }

    public static int fab2(int n, int[] arr) {
        if(arr[n]!=-1){
            return arr[n];
        }
        if(n==0){
            return 0;
        }
        if(n==1||n==2){
            arr[n] = 1;
        } else {
            arr[n] = fab2(n-1,arr)+fab2(n-2,arr);
        }
        return arr[n];
    }

    public static int fab3()
}
