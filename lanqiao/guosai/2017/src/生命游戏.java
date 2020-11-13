import java.util.ArrayList;
import java.util.Scanner;

public class 生命游戏 {
    public static char[][] map;
    public static ArrayList<Point> livingCell = new ArrayList<>();//记录存活的细胞
    public static ArrayList<Point> nextlivingCell;//记录下一次存活的细胞，每次循环新建
    public static ArrayList<Integer> livingCount = new ArrayList<>();//记录每一轮细胞存活数
    public static int row = 11;//11行
    public static int rank =38;//38列
    public static int[] rowDirect = {1, 0, -1, 1, -1, 1, 0, -1};//行方向的数组
    public static int[] rankDirect = {-1, -1, -1, 0, 0, 1, 1, 1};//列方向的数组


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        map = new char[row][rank];
        for (int i = 0; i < row; i++) {
            String s = scanner.nextLine();
            map[i] = s.toCharArray();
        }
        for (int i = 0; i < map.length; i++) {//先遍历map，将刚开始存活的细胞坐标记录。
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == 'X') {
                    livingCell.add(new Point(i, j));
                }
            }
        }
        livingCount.add(livingCell.size());//记录第0轮的细胞存货数量。

        for (int i = 1; i <= 100; i++) {//先进行100次循环，看看有木有规律
            nextlivingCell = new ArrayList<>();//每次开始循环就初始化
            for (int j = 0; j < livingCell.size(); j++) {
                Point curPoint = livingCell.get(j);
                int neiboPointCounts = 0;//记录当前点的邻近点的存活数量，只有周围是2或3个存活细胞才能存活
                for (int k = 0; k < rankDirect.length; k++) {
                    int drow = curPoint.row + rowDirect[k];
                    int drank = curPoint.rank + rankDirect[k];
                    if (livingCell.contains(new Point(drow, drank))) {//如果周边本身有存活细胞，数量++；
                        neiboPointCounts++;
                    } else {
                        if (!nextlivingCell.contains(new Point(drow, drank))) {//如果在变化后也还没变成存活的细胞
                            int neiboCounts = 0;//记录此点周围的点的存活数量。
                            for (int l = 0; l < rankDirect.length; l++) {
                                int drrow = drow + rowDirect[l];
                                int drrank = drank + rankDirect[l];
                                if (livingCell.contains(new Point(drrow, drrank))) {
                                    neiboCounts++;
                                }
                            }
                            if (neiboCounts == 3) {
                                nextlivingCell.add(new Point(drow, drank));
                            }
                        }
                    }
                }
                if (neiboPointCounts == 2 || neiboPointCounts == 3) {
                    nextlivingCell.add(curPoint);
                }
            }//上一代更新完毕
            livingCell = nextlivingCell;
            livingCount.add(new Integer(nextlivingCell.size()));

        }
        for (int i = 0; i < livingCount.size(); i++) {
            System.out.print(livingCount.get(i) + " ");
        }
        System.out.println();
        for (int i = 1; i < livingCount.size(); i++) {
            System.out.print(livingCount.get(i) - livingCount.get(i - 1) + " ");
        }
    }

    static class Point {
        int row;
        int rank;

        public Point(int row, int rank) {
            this.row = row;
            this.rank = rank;
        }

        @Override
        public boolean equals(Object o) {
            Point point = (Point) o;
            return point.row == this.row && point.rank == this.rank;
        }
    }
}