import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Classname 版本分支2
 * @Description TODO
 * @Date 2020/10/30 22:53
 * @Created by 94493
 */
public class 版本分支2 {
    public static int N = 100010;
    public static ArrayList<Integer>[] childs = new ArrayList[N];//将用于存放每个结点的所有子版本
    public static ArrayList<Integer>[] next = new ArrayList[N];//存放每个节点的直接子版本

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int Q = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            childs[i] = new ArrayList<>();
            next[i] = new ArrayList<>();
        }
        for (int i = 1; i < n; i++) {
            int u = scanner.nextInt();//父版本
            int v = scanner.nextInt();//子版本
            next[u].add(v);
        }
        childs[1] = getChilds(1);
        for (int i = 1; i <= Q; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(childs[x].contains(y) ? "YES" : "NO");
        }

    }

    /**
     * 获得当前节点的所有子版本
     *
     * @param root 当前节点下标
     * @return 返回包含所有子版本的数组
     */
    public static ArrayList<Integer> getChilds(int root) {
        for(int num:next[root]){
            childs[root].addAll(getChilds(num));
        }
        childs[root].add(root);
        return childs[root];
    }
}
