import java.util.Scanner;

/**
 * @Classname 版本分支
 * @Description 并查集，每次都得遍历全图，无法通过100%
 * @Date 2020/10/28 17:25
 * @Created by 94493
 */
public class 版本分支1 {
    public static int[] arr;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();//版本总数
        int Q = scanner.nextInt();//查询总数

        arr = new int[N + 1];
        for(int i=1;i<arr.length;i++){
            arr[i] = i;
        }
        for (int i = 1; i < N; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();

            arr[v] = u;//值是下标的父版本
        }

        for (int i = 1; i <= Q; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if (find(y) != x) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }

    public static int find(int x) {
        if (arr[x] == x) {
            return x;
        }
        return find(arr[x]);
    }
}
