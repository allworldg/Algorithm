/**
 * 工具类
 */
public class Utils {
    /**
     * 整型交换方法，返回数组
     *
     * @param arr 数组
     * @param a   下标
     * @param b   下标
     * @return
     */
    static int[] swap(int arr[], int a, int b) {
        int temp;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return arr;
    }

    /**
     * 用于将其他位置的值插入到指定地方
     * @param arr
     * @param a
     * @param b
     * @return 改变后的数组
     */
    static int[] insert(int arr[], int a, int b) {
        int temp;
        temp = arr[b];
        for(int i=b;i>a;i--){
            arr[i]=arr[i-1];
        }
        arr[a] = temp;
        return arr;
    }

    static void printout(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
