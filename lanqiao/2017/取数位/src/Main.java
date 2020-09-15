/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/9/11 18:08
 * @Created by 94493
 */
public class Main
{
    static int len(int x){
        if(x<10) return 1;
        return len(x/10)+1;
    }


    // 取x的第k位数字
    static int f(int x, int k){
        if(len(x)-k==0)
            return x%10;
        //填空
        return f(x/10,k);
    }


    public static void main(String[] args)
    {
        int x = 100;
        //System.out.println(len(x));
        System.out.println(f(x,1));
    }
}
