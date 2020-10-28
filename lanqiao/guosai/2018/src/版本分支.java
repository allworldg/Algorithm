import java.util.Scanner;

/**
 * @Classname 版本分支
 * @Description TODO
 * @Date 2020/10/28 17:25
 * @Created by 94493
 */
public class 版本分支 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        for (int i = 1; i <= 100000; i++)
            f[i] = i;
        for (int i = 1; i <= n - 1; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            f[y] = x;
        }
        while (q-- > 0) {
            int x = in.nextInt();
            int y = in.nextInt();
            boolean flag = false;
            while (f[y] != y) {
                if (f[y] == x) {
                    flag = true;
                    break;
                }
                y = f[y];
            }

            if (flag || x == y)
                System.out.println("YES");
            else
                System.out.println("NO");
        }

    }


    static int[] f = new int[100005];

    static int find(int x) {
        if (f[x] == x)
            return x;
        return find(f[x]);
    }

    static void union(int x, int y) {
        int a = f[x];
        int b = f[y];
        if (a != b)
            f[b] = a;
    }

}

