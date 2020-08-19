import java.util.Arrays;
import java.util.Scanner;

/**
 * @Classname Main
 * @Description 给出一个包含n个整数的数列，问整数a在数列中的第一次出现是第几个。
 * @Date 2020/8/19 9:11
 * @Created by 94493
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//整数个数
        if(n==0){
            return;
        }
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();//初始化
        }
        int result = scanner.nextInt();
        for(int i=0 ; i<arr.length;i++){
            if(result==arr[i]){
                System.out.println(i+1);//+1是题目要求，起始位置是1
                return;
            }
        }
        System.out.println(-1);
    }


}
