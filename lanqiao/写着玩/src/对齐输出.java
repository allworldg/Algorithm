import java.util.Scanner;

/**
 * @Classname 对齐输出
 * @Description TODO
 * @Date 2020/10/30 19:42
 * @Created by 94493
 */
public class 对齐输出 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i] = scanner.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            String s = String.valueOf(arr[i]);
            if(s.length()>8){
                System.out.print(s+" ");
            }else{
                for(int j=1;j<=8-s.length();j++){
                    System.out.print(" ");
                }if(i==2){
                    System.out.print(s);
                }else{
                    System.out.print(s+" ");
                }

            }
        }
    }
}
