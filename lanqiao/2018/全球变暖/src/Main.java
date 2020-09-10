import java.util.Scanner;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/9/8 20:39
 * @Created by 94493
 */
public class Main {
    static int N;
    static boolean[][] visited;
    static boolean[][] survived;//确定是否会被淹没
    static char[][] map;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        visited = new boolean[N + 1][N + 1];
        survived = new boolean[N + 1][N + 1];
        map = new char[N + 1][N + 1];
        map = new char[N + 1][N + 1];
        String str;
        char[] temp = new char[N + 1];
        for (int i = 1; i <= N; i++) {
            str = scanner.next();
            temp = str.toCharArray();
            for (int j = 1; j <= N; j++) {
                map[i][j] = temp[j - 1];

            }
        }
        //dfs查看岛屿
        int count = 0;
        for (int i = 2; i <= N; i++) {
            for (int j = 2; j <= N; j++) {
                if (map[i][j] == '#' && !visited[i][j]) {
                    dfs1(i, j);
                    count++;
                }
            }
        }
        visited = new boolean[N + 1][N + 1];
        int count1 = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (!visited[i][j] && survived[i][j]) {
                    dfs2(i, j);
                    count1++;
                }
            }
        }
        System.out.println(count-count1);
    }

    /**
     * 第一次探索连通变量，并且找出不会被淹没的陆地
     *
     * @param x
     * @param y
     */
    public static void dfs1(int x, int y) {
        if (x < 1 || x > N || y < 1 || y > N) {
            return;
        }
        if (visited[x][y] || map[x][y] != '#') {
            return;
        }
        if (map[x + 1][y] == '#' && map[x - 1][y] == '#' && map[x][y + 1] == '#' && map[x][y - 1] == '#') {
            survived[x][y] = true;
        }
        visited[x][y] = true;
        dfs1(x + 1, y);
        dfs1(x - 1, y);
        dfs1(x, y + 1);
        dfs1(x, y - 1);
    }

    public static void dfs2(int x, int y) {
        if (x < 1 || x > N || y < 1 || y > N) {
            return;
        }
        if (visited[x][y] || !survived[x][y]) {
            return;
        }
        visited[x][y] = true;
        dfs2(x + 1, y);
        dfs2(x - 1, y);
        dfs2(x, y + 1);
        dfs2(x, y - 1);
    }
}
