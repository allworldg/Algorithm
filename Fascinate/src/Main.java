import java.util.Scanner;

/**
 * Fibonacci数列的递推公式为：Fn=Fn-1+Fn-2，其中F1=F2=1。
 * 当n比较大时，Fn也非常大，现在我们想知道，Fn除以10007的余数是多少
 *
 * @ 算出每一次斐波那契就直接求余数，不必算到最终才计算余数
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(solve(sc.nextInt()));
    }

    /**
     * 非递归斐波那契
     *
     * @param n
     * @return
     */
    public static int Fas1(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        int a = 1, b = 1, c = 0;
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static int Fas2(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return Fas2(n - 1) + Fas2(n - 2);
    }


    public static int solve(int n) {
        if (n == 0) {
            return 0;
        }
        if(n==1||n==2){
            return 1;
        }

        int a=1,b=1;
        int result = 0;
        for(int i=3;i<=n;i++){
            result = (a+b)%10007;
            a=b;
            b=result;
        }
        return result;
    }

}
