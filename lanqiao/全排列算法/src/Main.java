import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * @Classname Main
 * @Description 全排列算法
 * @Date 2020/8/22 17:00
 * @Created by 94493
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        allSort(arr,0);

    }

    /**
     * 全排列算法实现，关键当指定到最后一个数时递归完成，逐个打印，其次是通过交换将每个元素
     * 都放在开头进行全排列以及确保每次交换前数组处于初始顺序
     *
     * @param arr
     * @param n
     */
    static void allSort(int[] arr, int n) {
        int temp;
        if (n == arr.length - 1) {//已经到最后一位数，递归结束，打印
            for (int i : arr) {
                System.out.print(i);
            }
            System.out.println();
        } else {
            for (int i = n; i < arr.length; i++) {
                swap(arr,n,i); //交换位置
                allSort(arr, n + 1);
                swap(arr,n,i);//将位置交换回来，以保证下次交换元素都处于初始状态
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp; //交换位置
    }
}
