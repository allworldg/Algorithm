package 数学;

/**
 * @Classname 质数计算
 * @Description TODO
 * @Date 2020/10/7 11:03
 * @Created by 94493
 */
public class 质数计算 {
    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }
    public static int countPrimes(int n) {
        int count = 0;
        for(int i=2;i<n;i++){
            int j = i-1;
            for(;j>1;j--){
                if (i%j==0){
                    break;
                }
            }
            if(j==1){
                count++;
            }
        }
        return count;
    }//暴力

    /**
     * 厄拉多塞筛法，找出数字的倍数，全部剔除，留下的就是质数
     * @param n
     * @return
     */
    public static int countPrimes1(int n){
        if(n<3){
            return 0;
        }
        int count = 0;
        boolean[] booleans = new boolean[n];
        for(int i=2;i<n;i++){
            if(!booleans[i]){
                count++;
                for(int j=i+i;j<n;j+=i){
                    booleans[j] = true;
                }
            }

        }

        return count;
    }
}
