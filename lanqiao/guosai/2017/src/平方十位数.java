import java.sql.SQLOutput;

/**
 * @Classname 平方十位数
 * @Description TODO
 * @Date 2020/10/31 11:06
 * @Created by 94493
 */
public class 平方十位数 {
    public static void main(String[] args) {
        for(long i = 100000;i>32000;i--){
            long sqrt = i*i;
            String s = String.valueOf(sqrt);
            boolean b = true;
            for(int j=0;j<s.length();j++){
                if(s.indexOf(String.valueOf(j))==-1){
                    b = false;
                    break;
                }
            }
            if(b){
                System.out.println(s);
                break;
            }
        }
    }
}
