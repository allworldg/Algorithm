import java.io.BufferedInputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class 小计算器 {
    public static int radix = 10;
    public static String op = "";//操作码
    public static long[] num = new long[2];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        int n = scanner.nextInt();
        scanner.nextLine();//下方要用nextline，所以在这里过滤掉回车
        for(int i=1;i<=n;i++){
            String[] term = scanner.nextLine().split("\\s");
            run(term);
        }
    }

    public static long calculate(String s) {
        switch (s) {
            case "ADD":
                num[0] = num[0] + num[1];
                break;
            case "SUB":
                num[0] = num[0] - num[1];
                break;
            case "MUL":
                num[0] = num[0] * num[1];
                break;
            case "DIV":
                num[0] = num[0] / num[1];
                break;
            case "MOD":
                num[0] = num[0] % num[1];
                break;
            default:
                break;
        }
        return num[0];
    }

    public static void run(String[] term) {
        switch (term[0]) {
            case "CLEAR"://清除
                num[0] = num[1] = 0;
                op = "";
                break;
            case "EQUAL":
                System.out.println(Long.toString(num[0], radix).toUpperCase());//十进制以上的英文字母要大写
                break;
            case "CHANGE":
                radix = Integer.parseInt(term[1]);
                break;
            case "ADD":
                op = "ADD";
                break;
            case "SUB":
                op = "SUB";
                break;
            case "MUL":
                op = "MUL";
                break;
            case "DIV":
                op = "DIV";
                break;
            case "MOD":
                op = "MOD";
                break;
            case "NUM":
                if (!op.equals("")) {//如果不为空，说明之前已经添加过数字，并且传入了操作符
                    //因为两次NUMBER命令不可能挨在一起
                    num[1] = Long.parseLong(term[1],radix);
                    num[0] = calculate(op);
                } else {
                    num[0] = Long.parseLong(term[1],radix);
                }
                break;
            default:
                break;
        }

    }
}