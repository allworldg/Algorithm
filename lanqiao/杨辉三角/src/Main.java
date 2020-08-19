import java.util.Scanner;

/**
 * @Classname Main
 * @Description 杨辉三角形又称Pascal三角形，它的第i+1行是(a+b)^i的展开式的系数。
 * 它的一个重要性质是：三角形中的每个数字等于它两肩上的数字相加。
 * 下面给出了杨辉三角形的前4行：
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 给出n，输出它的前n行。
 * @Date 2020/8/18 23:02
 * @Created by 94493
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//杨辉三角有几行
        int[][] arr = new int[n][];//创建二维数组
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[i + 1];//第0行有1个数字，以此类推
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == 0 || j == i) {//杨辉三角特性
                    arr[i][j]=1;
                }else{
                    arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
                }
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

