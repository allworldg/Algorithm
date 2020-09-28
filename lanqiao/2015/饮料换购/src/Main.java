import java.util.Scanner;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/9/26 15:44
 * @Created by 94493
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//买n瓶
        boolean flag = true;
        int count = n;
        while(n/3>0){
            count+=n/3;//加上能换的
            n = n/3+n%3;
        }

        System.out.println(count);
    }
}
