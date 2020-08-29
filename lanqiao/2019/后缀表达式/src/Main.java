import javax.annotation.Resource;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/8/29 0:00
 * @Created by 94493
 */
public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();//N个加号
        int M = scanner.nextInt();//M个减号
        BigInteger min = new BigInteger("1000000000");
        BigInteger sum = new BigInteger("0");
        long start = System.currentTimeMillis();
        BigInteger temp ;

        for(int i=0;i<N+M+1;i++){
            temp = scanner.nextBigInteger();
            sum = sum.add(temp);
            if(min.compareTo(temp)==1){
                min = temp;
            }
        }

        sum = sum.subtract(min.multiply(new BigInteger("2")));
        System.out.println(sum);
    }


}
