import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @Classname 找第一个只出现一次的字符
 * @Description TODO
 * @Date 2020/10/30 20:51
 * @Created by 94493
 */
public class 找第一个只出现一次的字符 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            hashMap.put(c,hashMap.getOrDefault(c,0)+1);
        }

        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(hashMap.get(c)==1){
                System.out.println(c);
                return;
            }
        }
        System.out.println("no");
    }
}
