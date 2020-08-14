

public class Main {
    public static void main(String[] args) {
        int arr[]={3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        arr = quick_sort(arr,0,arr.length-1);
        Utils.printout(arr);
    }

    static int[] quick_sort(int[] arr, int l, int r) {
        if (l < r) {
            int m = partition(arr, l, r);
            quick_sort(arr, l, m);
            quick_sort(arr, m + 1, r);
        }
        return arr;
    }

    static int partition(int[] arr, int l, int r) {
        int p = arr[l];//开始的枢纽
        int m = l;  //开始的s1 s2为空
        for (int i = l + 1; i <= r; i++) {
            if (arr[i] < p) {
                m++;
                Utils.swap(arr, m, i);
            }
        }
        Utils.swap(arr, l, m);//交换枢纽和m位置，枢纽位置确定。
        return m;//返回位置，方便快速排序使用
    }
}
