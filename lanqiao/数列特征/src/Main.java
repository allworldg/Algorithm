import java.util.Scanner;

/**
 * @Classname Main
 * @Description 给出n个数，找出这n个数的最大值，最小值，和。
 * @Date 2020/8/19 10:21
 * @Created by 94493
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i:arr){
            max = Math.max(max,i);
            min = Math.min(min,i);
            sum = sum+i;

        }

        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);
    }

}
