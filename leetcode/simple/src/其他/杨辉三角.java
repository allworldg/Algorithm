package 其他;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Classname 杨辉三角
 * @Description TODO
 * @Date 2020/10/7 20:55
 * @Created by 94493
 */
public class 杨辉三角 {
    public static void main(String[] args) {
        generate(5);
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arrayLists = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            ArrayList<Integer> arrayList = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||i==0||j==i){
                    arrayList.add(1);
                }else {
                    arrayList.add(arrayLists.get(i-1).get(j-1)+arrayLists.get(i-1).get(j));
                }

            }
            arrayLists.add(arrayList);
        }
        return arrayLists;
    }
}
