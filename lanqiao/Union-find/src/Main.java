/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/8/25 13:13
 * @Created by 94493
 */
public class Main {
    public Main(int[] arr){
        this.count = arr.length;//刚开始每个端点都是一个向量。
        this.arr = arr;

    }
    public static void main(String[] args) {
        int[] arr = {0,1,1,3,2,5,6};
        Main main = new Main(arr);
        unionRoot(arr,2,4);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static int find(int[] arr, int i) {
        return arr[i];
    }

    public static int findRoot(int[] arr,int i){
        while(arr[i]!=i) i=arr[i];
        return i;
    }

    public static void union(int[] arr, int i, int j) {
        int q = find(arr, i);
        int p = find(arr, j);
        if (q == p) {
            return;//如果相等表示已经联通，不用操作
        }
        for(int n=0;n<arr.length;n++){
            if(arr[n]==q){
                arr[n] = p;
            }
        }
    }

    /**
     * 通过连接根节点向量来加快连接速度
     * @param arr
     * @param i
     * @param j
     */
    public static void unionRoot(int[] arr, int i, int j) {
        int q = findRoot(arr, i);
        int p = findRoot(arr, j);
        if (q == p) {
            return;//如果相等表示已经联通，不用操作
        }
        arr[p] = q;//修改根节点即可
    }

    private int count;//连通数量
    private int[] arr;//存放向量
}
