import java.util.Scanner;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/9/11 11:56
 * @Created by 94493
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] temp = new double[31][31];
        for(int i=1;i<=29;i++){
            for(int j=1;j<=i;j++){
                temp[i][j] = scanner.nextDouble();
            }
        }

        for(int i=2;i<=30;i++){
            for(int j=1;j<=i;j++){
                if(j==1){
                    temp[i][j] = temp[i-1][j]/2.0+temp[i][j];
                }else{
                    temp[i][j] = temp[i][j]+temp[i-1][j-1]/2.0+temp[i-1][j]/2.0;
                }
            }
        }

        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        for(int j=1;j<=30;j++){
                max = Math.max(max,temp[30][j]);
                min = Math.min(min,temp[30][j]);
        }
        System.out.println((long)(2086458231*max/min));
    }
}
