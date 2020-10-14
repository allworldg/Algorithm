package 其他;

/**
 * @Classname 汉明距离,判断位数不同要想到异或操作。
 * @Description TODO
 * @Date 2020/10/7 16:20
 * @Created by 94493
 */
public class 汉明距离 {
    public static void main(String[] args) {
        System.out.println(hammingDistance1(1, 4));
    }
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }

    public static int hammingDistance1(int x, int y) {
        int count = 0;
        int num = x^y;
        while(num!=0){
            if((num&1)!=0){
                count++;
            }
            num>>=1;
        }
        return count;
    }
}
