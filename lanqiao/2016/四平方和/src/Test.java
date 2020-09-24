import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sr = sc.nextInt();
        int flag=0;
        int sq = (int) Math.sqrt(sr);
        for(int a=0;a<sq+1;a++)
        {
            for(int b=a;b<sq+1;b++)
            {
                for(int c=b;c<sq+1;c++)
                {
                    for(int d=c;d<sq+1;d++)
                    {
                        if(a*a+b*b+c*c+d*d==sr)
                        {
                            System.out.println(a+" "+b+" "+c+" "+d);
                            flag=1;
                            break;
                        }
                    }
                    if(flag==1)    break;
                }
                if(flag==1)    break;
            }
            if(flag==1)    break;
        }
    }
}