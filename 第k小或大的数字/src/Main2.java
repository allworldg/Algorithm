import java.util.Currency;

/**
 * @Classname Main
 * @Description 找第n大的数字
 * @Date 2020/9/24 19:29
 * @Created by 94493
 */
public class Main2 {
    public static int minCursor = 0;
    public static int min = Integer.MAX_VALUE;
    public static void main(String[] args) {
        int k =4;//找第k大的数字
        int[] arr = {10,33,22,2,1,8,7,8,7};
        for(int i=0;i<k;i++){
            min(arr,i);
        }

        for(int i=k;i<arr.length;i++){
            if(arr[i]>min){
                minInsert(arr,i);
                min(arr,i);
            }
        }

        System.out.println(arr[minCursor]);
    }

    public static void minInsert(int[] arr,int i){
        arr[minCursor] = arr[i];
        min = arr[i];
    }

    /**
     * 记录k范围内最小值以及最小值的下标
     * @param arr
     * @param i
     */
    public static void min(int[] arr, int i){
        if(min>arr[i]){
            min = arr[i];
            minCursor = i;
        }
    }
}
