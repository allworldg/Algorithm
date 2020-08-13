public class Main {
    public static void main(String[] args) {
        int[] arr = {3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        arr = buble_sort(arr);
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

   static int[] buble_sort(int[] arr) {
        boolean flag ;
        do {
            flag = false;
            for (int N = arr.length - 1; N > 1; N--) {
                for (int i = 0; i < N; i++) {
                    if (arr[i] > arr[i + 1]) {
                        arr = swap(arr, i, i + 1);
                        flag = true;
                    }
                }
            }
        } while (flag);
        return arr;
    }

  static  int[] swap(int[] arr, int a, int b) {
        int temp;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return arr;
    }


}

