/**
 * @Classname Fas
 * @Description 斐波那契递归和动态规划
 * @Date 2020/8/31 12:13
 * @Created by 94493
 */
public class Fas {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(fab4(7));
    }

    /**
     * 递归
     * @param n
     * @return
     */
    public static int fab1(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return fab1(n - 1) + fab1(n - 2);
    }

    /**
     * 动态规划，自顶向下，记住每一个计算的结果，减少重复计算。
     * @param n
     * @param arr
     * @return
     */
    public static int fab2(int n, int[] arr) {
        if(arr[n]!=-1){
            return arr[n];
        }
        if(n==0){
            return 0;
        }
        if(n==1||n==2){
            arr[n] = 1;
        } else {
            arr[n] = fab2(n-1,arr)+fab2(n-2,arr);
        }
        return arr[n];
    }

    /**
     * 动态规划，自底向上，提前算出每个子结果，然后结合算出总结果
     * @return
     */
    public static int fab3(int n){
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 1;
        for(int i=3;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n];
    }

    /**
     * 优化，只需要记住i i-1 i-2即可
     */
    public static int fab4(int n){
        if(n==0){
            return 0;
        }
        if(n==1||n==2){
            return 1;
        }
        int a=1;
        int b=1;
        int c=0;
        for(int i=3;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }
}
