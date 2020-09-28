/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/9/27 15:12
 * @Created by 94493
 */
public class Main {
    public static void main(String[] args) {
        int count = 0;
        for(int i=1;i<=9;i++){
            for(int j=1;j<=9;j++){
                if(i==j){
                    continue;
                }
                for(int k=1;k<=9;k++){
                    for(int l=1;l<=9;l++){
                        if(k==l){
                            continue;
                        }
                if((i*1.0/j)*k*1.0/l==((i*10+k)*1.0)/(1.0*(j*10+l)))
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }


}
