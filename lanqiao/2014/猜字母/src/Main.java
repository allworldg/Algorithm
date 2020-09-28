import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/9/26 21:47
 * @Created by 94493
 */
public class Main {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        String a = "abcdefghijklmnopqrs";
        for(int i=1;i<=105;i++){
            a +="abcdefghijklmnopqrs";
        }
        char[] c = a.toCharArray();
        for(int i=0;i<c.length;i++){
            arrayList.add(c[i]);
        }

        while(arrayList.size()>1){
            for(int i=0;i<arrayList.size();i++){
                arrayList.remove(i);
            }
        }

        System.out.println(arrayList.get(0));
    }
}
