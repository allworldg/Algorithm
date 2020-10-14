package 数学;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @Classname 数学.数学
 * @Description TODO
 * @Date 2020/10/6 20:56
 * @Created by 94493
 */
public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fizzBuzz1(3).toArray()));
    }
    public static List<String> fizzBuzz(int n) {
        ArrayList<String> arrayList = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0&&i%5==0){
                arrayList.add("FizzBuzz");
            }else if(i%3==0){
                arrayList.add("Fizz");
            }else if(i%5==0){
                arrayList.add("Buzz");
            } else {
                arrayList.add(i+"");
            }
        }
        return arrayList;
    }

    public static List<String> fizzBuzz1(int n){
        ArrayList<String> arrayList = new ArrayList<>();
        HashMap<Integer,String> hashMap = new HashMap<Integer, String>(){
            {
                put(3,"Fizz");
                put(5,"Buzz");
            }
        };
        for(int i=1;i<=n;i++){
            StringBuffer sb = new StringBuffer();
            for(Integer integer:hashMap.keySet()){
                    if(i%integer==0){
                        sb.append(hashMap.get(integer));
                    }
            }
            if (sb.toString().equals("")){
                sb.append(i+"");

            }
            arrayList.add(sb.toString());
        }
        return arrayList;
    }


}
