public class Main{
    public static int count = 0;
    public static int sum = 0;
    public static void main(String[] args) {
        dfs(1);
        System.out.println(count);
    }

    /**
     *
     * @param k k号
     */
    public static void dfs(int k){
        if(k>14||sum>13){
            return;//选到了第14号牌或者手上总和已经超过了13张卡
        }

        if(k==14&&sum==13){
            count++;
            return;
        }

        for(int i=0;i<5;i++){
            sum+=i;
            dfs(k+1);
            sum-=i;
        }

    }
}