import java.util.Scanner;

/**
 * @Classname CircleArea
 * @Description 给定圆的半径r，求圆的面积
 * @Date 2020/8/17 21:03
 * @Created by 94493
 */
class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        double result = (a*a)*Math.PI;
        System.out.println(String.format("%.7f",result));
    }
}
