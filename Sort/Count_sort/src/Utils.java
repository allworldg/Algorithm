import java.util.HashSet;
import java.util.Set;

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
     * @param a 需要插入的目标位置
     * @param b 要移动的下标
     * @return 改变后的数组
     */
    static int[] insert(int arr[], int a, int b) {
        int temp;
        temp = arr[b];
        if(b>a){    //向前插入
            for(int i=b;i>a;i--){
                arr[i]=arr[i-1];
            }
            arr[a] = temp;
        }
        if(b<=a){   //向后插入
            for(int i=b;i<a;i++){
                arr[i]=arr[i+1];
            }
            arr[a] = temp;
        }

        return arr;
    }

    /**
     * 循环打印数组的每个值
     * @param arr
     */
    static void printout(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    static void printout(Object[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    /**
     * 利用hashset挑出数组中不重复的数字并且排序
     * @param arr
     * @return
     */
    static Object[] simpleArray(Object[] arr){
        Set set = new HashSet();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        return set.toArray();
    }
}
