
public class Test {

    public static int counts=0;
    public static int sum=0;

    public static void caculate(int k) {
        if(sum>13||k>13) {
            return;//溢出出口
        }
        if(sum==13&&k==13) {//计算出口
            counts++;
            return;
        }
        if(k<13) {
            for(int i=0;i<5;i++) {
                sum+=i;//回溯
                caculate(k+1);
                sum-=i;//回溯
            }
        }
    }

    public static void main(String[] args) {
        //dfs
        caculate(0);
        System.out.println(counts);
    }
}
