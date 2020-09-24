import com.sun.org.apache.xpath.internal.SourceTree;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Classname Main
 * @Description 全排列算法
 * @Date 2020/8/22 17:00
 * @Created by 94493
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2};
        allSort(arr,0);


    }

    /**
     * 全排列算法实现，关键当指定到最后一个数时递归完成，逐个打印，其次是通过交换将每个元素
     * 都放在开头进行全排列以及确保每次交换前数组处于初始顺序
     *
     * @param arr
     * @param cursor 下标
     */
    static void allSort(int[] arr, int cursor) {
        if(cursor == arr.length-1){
            System.out.println(Arrays.toString(arr));
        } else {
            for(int i=cursor;i<arr.length;i++){
                if(!swapAccepted(arr,cursor,i)){
                    continue;
                }
                swap(arr,cursor,i);//下标进行和之后的位置逐个交换
                allSort(arr,cursor+1);//每次交换完都要求出后面子序列的全排列，所以位置往后移动，递归
                swap(arr,cursor,i);//换回来，保证每次全排列之前都是初始状态
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp; //交换位置
    }

    private static boolean swapAccepted(int[] array, int start, int end) {
        for (int i = start; i < end; i++) {
            if (array[i] == array[end]) {
                return false;
            }
        }
        return true;
    }
}
