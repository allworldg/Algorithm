import java.util.Scanner;

/**
 * @Classname Main
 * @Description 闰年判断
 * @Date 2020/8/21 12:02
 * @Created by 94493
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 4 == 0 && n % 100 != 0) {
            System.out.println("yes");
            return;
        }
        if(n%400==0){
            System.out.println("yes");
            return;
        }

        System.out.println("no");
        return;
    }
}
