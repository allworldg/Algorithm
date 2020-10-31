import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class 整理玩具 {
    public static char[][] maps;
    public static boolean[][] visited;//map上的点是否被访问过，访问过就记下属于哪个连通分量
    public static int[] appear1;//第一次地图初始化的时候记录每个数字出现的次数，下标是数字，值为次数
    public static int[] appear2;//一次dfs遍历地图后数字出现的次数
    public static int[] dx = {1, -1, 0, 0};
    public static int[] dy = {0, 0, 1, -1};
    public static int max_x;//保存尽可能靠右的x坐标
    public static int max_y;//保存尽可能靠下的y坐标

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        int T = scanner.nextInt();

        while (T-- > 0) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            maps = new char[N][M];
            visited = new boolean[N][M];
            appear1 = new int[10];
            appear2 = new int[10];
           for(int i=0;i<N;i++){
               char[] c = scanner.next().toCharArray();
               for(int j = 0;j<c.length;j++){
                   maps[i][j] = c[j];
                   appear1[maps[i][j]-'0'] ++;
               }
           }

           boolean b = check();
           if(b==false){
               System.out.println("NO");
           }else{
               System.out.println("YES");
           }
        }
    }

    public static boolean check() {
        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[i].length; j++) {
                if (appear2[maps[i][j] - '0'] == 0) {//当前数字没有被访问过
                    max_x = -1;
                    max_y = -1;
                    dfs(i, j);//开始dfs，顺便传一个连通分量进去
                    int count1 = appear1[maps[i][j] - '0'];
                    int count2 = appear2[maps[i][j] - '0'];

                    if (count1 != count2) {//不等于说明这一次遍历有相同的数没有紧挨着
                        return false;
                    }

                    for (int ii = i; ii < max_x; ii++) {//判断是否是矩形，就需要判断从起点到终点是否有其他不一样的数字
                        for (int jj = j; jj < max_y; jj++) {
                            if (maps[i][j] != maps[ii][jj]) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void dfs(int x, int y) {
        max_x = Math.max(x, max_x);
        max_y = Math.max(y, max_y);
        visited[x][y] = true;//该点访问过
        appear2[maps[x][y] - '0']++;//遍历中记录该数字出现的次数
        for (int i = 0; i < dx.length; i++) {
            int u = x + dx[i];
            int v = y + dy[i];
            if (u >= 0 && u <= maps.length - 1 && v >= 0 && v <= maps[u].length - 1 && visited[u][v] == false && maps[max_x][max_y] == maps[u][v]) {
                {
                    dfs(u, v);
                }
            }
        }

    }
}