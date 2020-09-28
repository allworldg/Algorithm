import java.util.Arrays;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/9/28 10:40
 * @Created by 94493
 */
public class Main {
    public static char[] arr = {'A', 'A', '2', '2', '3', '3', '4', '4'};

    public static void main(String[] args) {
        allSort(0);
    }

    public static boolean allowedSwap(int start, int end) {
        for (int i = start; i < end; i++) {
            if (arr[i] == arr[end]) {
                return false;
            }
        }
        return true;
    }

    public static void allSort(int k) {
        if (k == arr.length - 1) {
            if(rfind('A')-find('A')==2&&rfind('2')-find('2')==3&&rfind('3')-find('3')==4
            &&rfind('4')-find('4')==5){
                System.out.println(Arrays.toString(arr));
            }
            return;
        }

        for (int i = k; i < arr.length; i++) {
            if (allowedSwap(k, i)) {
                swap(k, i);
                allSort(k + 1);
                swap(k, i);
            }
        }
    }

    public static void swap(int indexa, int indexb) {
        char temp = arr[indexa];
        arr[indexa] = arr[indexb];
        arr[indexb] = temp;
    }

    public static int find(char c){
        for(int i=0;i<arr.length;i++){
            if(c==arr[i]){
                return i;
            }


        }
        return 0;
    }

    public static int rfind(char c){
        for(int i=arr.length-1;i>=0;i--){
            if(c==arr[i]){
                return i;
            }
        }
        return 0;
    }

}
