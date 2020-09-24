

import java.util.HashSet;

public class Main {

    /**
     * @param args
     */

    //答案：116
    private static int[] map = new int[5];
    private static int[] visit = new int[13];
    private static HashSet<HashSet<Integer>> set = new HashSet<HashSet<Integer>>();

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        dfs(0);
        System.out.println(set.size());//set的大小就是剪法的种数
    }

    private static void dfs(int n) {
        // TODO Auto-generated method stub
        if(n==5){
            HashSet<Integer> s = new HashSet<Integer>();//定义局部HashSet变量
            for(int i=0;i<5;i++){
                s.add(map[i]);
            }
            set.add(s);//去除重复满足条件的剪法
            return;
        }

        for(int i=1;i<13;i++){
            if(visit[i]==0 && check(n,i)){//去掉无用的数据
                visit[i]=1;
                map[n]=i;
                dfs(n+1);
                visit[i]=0;
            }
        }
    }
    //判断已填的数字是否相连
    private static boolean check(int n, int i) {
        // TODO Auto-generated method stub
        if(n==0)
            return true;
        for(int k=0;k<n;k++){
            if(adj(map[k],i))
                return true;
        }
        return false;
    }

    private static boolean adj(int m, int n) {
        // TODO Auto-generated method stub
        //判断是否是相连的格子，如果是上下位置：Math.abs(m-n)==4，如果是左右位置：则需判断是否是最右边的格子：Math.min(m, n)%4!=0，当不是最右边格子进一步判断：Math.abs(m-n)==1
        if(Math.abs(m-n)==4 || (Math.abs(m-n)==1 && Math.min(m, n)%4!=0))
            return true;
        return false;
    }

}

