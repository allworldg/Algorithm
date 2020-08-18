import javax.script.ScriptContext;
import java.util.Scanner;

/**
 * @Classname Sum
 * @Description TODO
 * @Date 2020/8/17 22:26
 * @Created by 94493
 */
public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(sum(scanner.nextInt()));
    }

    static long sum(long n){
        if(n==0||n==1){
            return n;
        }
        long result = (1+n)*n/2;
        return result;
    }

}
