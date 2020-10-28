import java.util.Arrays;

/**
 * @Classname 最大乘积
 * @Description TODO
 * @Date 2020/10/26 21:28
 * @Created by 94493
 */
public class 最大乘积 {
    public static int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int max = 0;

    public static void main(String[] args) {
        allsort(0);
        System.out.println(max);
    }

    public static void allsort(int cursor) {
        if (cursor == arr.length - 1) {
            if(Arrays.toString(arr).equals("[9, 6, 8, 7, 4, 5, 2, 3, 1]")){
                System.out.println(1);
            }
            caculate();
        }

        for (int i = cursor; i < arr.length; i++) {
            swap(cursor, i);
            allsort(cursor + 1);
            swap(cursor, i);
        }
    }

    public static void caculate() {
        for (int cursor = 0; cursor < arr.length - 2; cursor++) {
            String s1 = "";
            String s2 = "";
            for (int i = 0; i <= cursor; i++) {
                s1 += arr[i];
            }

            for (int i = cursor + 1; i < arr.length; i++) {
                s2 += arr[i];
            }

            String result = String.valueOf(Integer.parseInt(s1) * Integer.parseInt(s2));
            if(s1.equals("96")&&s2.equals("8745231")){
                System.out.println(1);
            }
            if (!check(result)) {
                continue;
            }

            max = Math.max(max, Integer.parseInt(result));
        }
    }

    public static boolean check(String num) {
        for (int i = 1; i <= 9; i++) {
            if (num.indexOf(String.valueOf(i)) == -1) {
                return false;
            }
        }
        return true;
    }

    public static void swap(int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

}
