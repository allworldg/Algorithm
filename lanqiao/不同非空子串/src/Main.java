import java.util.HashMap;

/**
 * @Classname Main
 * @Description 请问，字符串0100110001010001有多少个不同的非空字串。
 * @Date 2020/8/22 15:25
 * @Created by 94493
 */
public class Main {
    public static void main(String[] args) {
        String str = "0100110001010001";
        HashMap hashMap = new HashMap();//利用hashmap的去重和排序特性，可以轻松的实现
        int i;
        int j;
        for(i=0;i<str.length();i++){
            for(j=i+1;j<=str.length();j++){
                hashMap.put(str.substring(i,j),1);
            }
        }
        System.out.println(hashMap.size());

    }
}
