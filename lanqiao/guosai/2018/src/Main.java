import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while(T-->0) {
            n = in.nextInt();
            m = in.nextInt();
            cur = new int[15];
            cnt = new int[15];
            ch = new char[n+5][m+5];
            vis = new int[n+5][m+5];
            for(int i=0;i<n;i++)
                ch[i] = in.next().toCharArray();
            for(int i=0;i<n;i++)
                for(int j=0;j<m;j++)
                    cur[ch[i][j]-'0']++;
            boolean flag = getAns();
            if(flag)
                System.out.println("YES");
            else
                System.out.println("NO");
        }

    }

    static char[][] ch;
    static int n,m,mx,my;
    static int[] cur;//记录图中0-9出现的个数
    static int[] cnt;//记录搜索中出现0-9的个数
    static int[] dx = new int[] {1,-1,0,0};
    static int[] dy = new int[] {0,0,1,-1};
    static int[][] vis;

    static void dfs(int x,int y,int t) {
        mx = Math.max(mx, x);
        my = Math.max(my, y);

        vis[x][y] = t;
        cnt[ch[x][y]-'0']++;
        for(int i=0;i<4;i++) {
            int u = x+dx[i];
            int v = y+dy[i];
            if(u>=0 && u<n && v>=0 && v<m && vis[u][v]==0 && ch[u][v]==ch[x][y])
                dfs(u,v,t);
        }
    }

    static boolean getAns() {
        int t=0;
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                if(cnt[ch[i][j]-'0']==0) {//可以设个变量t = ch[i][j]-'0',更好书写
                    mx=my=-1;
                    dfs(i,j,++t);
                    if(cnt[ch[i][j]-'0']!=cur[ch[i][j]-'0'])
                        return false;

                    for(int ii=i;ii<=mx;ii++)//判断是否矩形,mx,my记录右下角
                        for(int jj=j;jj<=my;jj++)
                            if(vis[ii][jj]!=vis[i][j])
                                return false;
                }

        return true;
    }


}