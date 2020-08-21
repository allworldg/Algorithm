import java.util.Scanner;

/**
 * @Classname Main
 * @Description 字母图形
 * @Date 2020/8/19 12:06
 * @Created by 94493
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//n行
        int m = scanner.nextInt();//m列
        char[][] arr = new char[26][26];
        for(int i=0;i<n;i++){
            char c = 'A';
            for(int j = i;j<m;j++){
                arr[i][j] = c;//向后增加
                c++;
            }
            c='A';
            for(int j=i-1;j>=0;j--){
                arr[i][j]=++c;

            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
}
