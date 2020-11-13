import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
//此oj类名必须用Main
public class Test {
    public static long[] num= {0,0};
    public static int hex=10;
    public static String op="";
    public static long Calcu() {
        switch(op) {
            case "ADD":
                num[0]=num[0]+num[1];
                break;
            case "SUB":
                num[0]=num[0]-num[1];
                break;
            case "MUL":
                num[0]=num[0]*num[1];
                break;
            case "DIV":
                num[0]=num[0]/num[1];
                break;
            case "MOD":
                num[0]=num[0]%num[1];
                break;
            default:
                break;
        }
        //System.out.println("计算得出 "+num[0]);
        return num[0];
    }
    public static void Recog(String[] term){
        switch(term[0]) {
            case "NUM":
                if(op.equals(""))
                    //parseLong(term[1],hex); 将hex进制的数转换为十进制的字符串形式
                    num[0]=Long.parseLong(term[1],hex);
                else {
                    num[1]=Long.parseLong(term[1],hex);
                    num[0]=Calcu();
                    op="";
                }
                break;
            case "ADD":
                op="ADD";
                break;
            case "SUB":
                op="SUB";
                break;
            case "MUL":
                op="MUL";
                break;
            case "DIV":
                op="DIV";
                break;
            case "MOD":
                op="MOD";
                break;
            case "CHANGE":
                hex=Integer.parseInt(term[1]);
                break;
            case "CLEAR":
                num[0]=num[1]=0;
                op="";
                break;
            case "EQUAL":
                //toUpperCase() 十进制以上输出字母必须为大写
                //toString(num[0],hex) 将十进制的数转换为hex进制的字符串形式
                System.out.println(Long.toString(num[0],hex).toUpperCase());
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        int n=0;
        String s=new String();
        //Scanner sc=new Scanner(System.in);
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //n=sc.nextInt(); 不能用此方法输入，需要接收到"\n"才会停止输入
        n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++) {
            s=br.readLine();
            String[] term=s.split(" ");
            Recog(term);
        }
    }
}
