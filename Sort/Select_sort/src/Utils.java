/**
 * 工具类
 */
public class Utils {
    /**
     * 整型交换方法，返回数组
     * @param arr 数组
     * @param a 下标
     * @param b 下标
     * @return
     */
    static int[] swap(int arr[], int a, int b) {
        int temp;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return arr;
    }
}
