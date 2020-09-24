/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/9/20 16:32
 * @Created by 94493
 */
public class Main {
    public static void main(String[] args) {
        int num = 0;

        for(int i=2;i<=47;i++){//第一个+号的位置
            int sum = 1225;
            sum = sum-(i+i-1)+(i*(i-1));
            for(int j=i+2;j<=49;j++){
                num = sum-(j+j-1)+(j*(j-1));
                if(num == 2015){
                    System.out.println(i-1);
                }
            }
        }
    }
}
