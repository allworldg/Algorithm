package 其他;

/**
 * @Classname 位1的个数
 * @Description TODO
 * @Date 2020/10/7 16:04
 * @Created by 94493
 */
public class 位1的个数 {
    public int hammingWeight(int n) {
        int count = 0;
        int num = 1;
        while(num!=0)//左移超过32位就变成0
        {
            if((num&n)!=0) {
                count++;
            }
            num<<=1;
        }
        return count;
    }
}
