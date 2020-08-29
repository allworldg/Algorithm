import java.util.Scanner;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/8/28 16:24
 * @Created by 94493
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int result = 0;
        for(int i=0;i<=num;i++){
            if(exist(String.valueOf(i))){
                result = result+i;
            }
        }
        System.out.println(result);
    }

    public static boolean exist(String s){
        if(s.indexOf("2")!=-1||s.indexOf("0")!=-1||s.indexOf("1")!=-1||s.indexOf("9")!=-1){
            return true;
        }
        return false;
    }
}
