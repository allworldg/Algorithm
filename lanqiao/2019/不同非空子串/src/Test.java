/**
 * @Classname Test
 * @Description TODO
 * @Date 2020/8/28 11:35
 * @Created by 94493
 */
public class Test {
    public static void main(String[] args) {
        int n = 20190324;
        int a=1,b=1,c=1;
        int result = 0;
        for(int i=4;i<=n;i++){
            result = (a+b+c)%10000;
            a=b;
            b=c;
            c=result;
        }
        System.out.println(result);
    }
}
