/**
 * @Classname Main
 * @Description 给定数列1，1，1，3，5，9，17，。。。，从第4项开始，每项都是前3项的和。求第20190324项的最后4位数字。
 * @Date 2020/8/22 15:50
 * @Created by 94493
 */
public class Main {
    public static void main(String[] args) {
        int a = 1, b = 1, c = 1;
        int result = 0;
        for(int i=4;i<=20190324;i++){
            result = (a+b+c)%10000;//通过求余数得到低四位
            a=b;
            b=c;
            c=result;
        }
        System.out.println(result);
    }
}
