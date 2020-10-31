import java.util.Scanner;

public class n次方后四位{
    public static int N = 2011;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();//先有next再有nextline记得多加一行nextline；
        for(int i=0;i<n;i++){
            String s = scanner.nextLine();
            int k = 1;
            int t = 0;//不大于四位数
            int sum = 1;//求次方结果
            char[] c = s.toCharArray();
            int len = c.length;
            while(len>0&&t<1000){
                t += (c[len-1]-'0')*k;
                k*=10;
                len--;
            }
            for(int j=1;j<=t;j++){
                sum = sum*N%10000;
            }
            System.out.println(sum);
        }
    }
}