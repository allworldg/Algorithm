/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/9/26 21:00
 * @Created by 94493
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(func(2));
    }
    public static int func(int n){
        if(n==0){
            return 2;
        }
        return 2*func(n-1)-1;
    }
}
