/**
 * @Classname Main
 * @Description 153是一个非常特殊的数，它等于它的每位数字的立方和，即153=1*1*1+5*5*5+3*3*3。编程求所有满足这种条件的三位十进制数。
 * @Date 2020/8/18 19:45
 * @Created by 94493
 */
public class Main {
    public static void main(String[] args) {

        for(int i=100; i<1000;i++){
            char[] chars = Integer.toString(i).toCharArray();
            int sum = 0;
            for(int j=0;j<chars.length;j++){
                sum = sum+(chars[j]-48)*(chars[j]-48)*(chars[j]-48);//因为ascii码，所以计算时要减去48才是真实大小
            }
            if(i==sum){
                System.out.println(i);
            }
        }
    }
}
