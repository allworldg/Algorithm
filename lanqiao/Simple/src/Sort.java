import java.util.Arrays;
        import java.util.Scanner;

/**
 * @Classname Sort
 * @Description 根据输入排序
 * @Date 2020/8/18 9:39
 * @Created by 94493
 */
public class Sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n==0){
            System.out.println(n);
            return;
        }
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }



}
