/**
 * @Classname Main
 * @Description 如图p1.pgn所示的螺旋折线经过平面上所有整点恰好一次。
 * 对于整点(X, Y)，我们定义它到原点的距离dis(X, Y)是从原点到(X, Y)的螺旋折线段的长度。
 * @Date 2020/9/4 17:57
 * @Created by 94493
 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();
        long y = scanner.nextLong();
        long n = Math.max(Math.abs(x), Math.abs(y));//确定在第几个变换后正方形
        long distance = 0;
        if (x >= y) {
            distance = 8 * n + n * (n - 1) * 8 / 2 -( x + n + y + n);
        } else {
            long m = n-1;
            distance = 8 * m + m * (m - 1) * 8 / 2+(x+n+y+n);
        }
        System.out.println(distance);
        
    }
}


