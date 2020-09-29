import java.util.Scanner;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/9/29 16:11
 * @Created by 94493
 */
public class Main {
    public static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//n个小朋友
        int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
        }
        while(!check(arr)){
            int m = arr[0]/2;
            for(int i=0;i<arr.length-1;i++){
               arr[i] = arr[i]/2+arr[i+1]/2;
               if(arr[i]%2!=0){
                   arr[i]++;
                   count++;
               }
            }
            arr[arr.length-1] = arr[arr.length-1]/2+m;
            if(arr[arr.length-1]%2!=0){
                arr[arr.length-1]++;
                count++;
            }

        }
        System.out.println(count);

    }

    public static boolean check(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
