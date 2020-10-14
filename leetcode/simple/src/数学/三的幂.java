package 数学;

/**
 * @Classname 三的幂
 * @Description TODO
 * @Date 2020/10/7 12:41
 * @Created by 94493
 */
public class 三的幂 {
    public static void main(String[] args) {
        isPowerOfThree(2);
    }
    public static  boolean isPowerOfThree(int n) {
        if(n<1){
            return false;
        }
        while(n%3==0){
            n/=3;
        }

        return n==1;

    }
}
