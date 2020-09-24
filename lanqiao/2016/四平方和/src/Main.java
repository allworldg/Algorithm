import jdk.nashorn.internal.ir.ReturnNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/9/16 20:27
 * @Created by 94493
 */
public class Main {
    public static void main(String[] args) {

        ArrayList<Integer[]> arrayList = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for(int i=0;i*i<=number;i++){
            for(int j=i;j*j<=number;j++){
                for(int k=j;k*k<=number;k++){
                    for(int h=k;h*h<=number;h++){
                        if(i*i+j*j+k*k+h*h==number){
                            System.out.print(i+" "+j+" "+k+" "+h);
                            return;
                        }
                    }
                }
            }
        }



    }
}
