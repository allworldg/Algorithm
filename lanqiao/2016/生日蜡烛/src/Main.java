/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/9/15 10:04
 * @Created by 94493
 */
public class Main {
    public static void main(String[] args) {
        for(int i=0;i<=100;i++){
            int count = 0;
            for(int j=i;j<=100;j++){
                count+=j;
                if(count>236){
                    break;
                }

                if(count==236){
                    System.out.println(i);
                    return;
                }
            }
        }
    }
}
