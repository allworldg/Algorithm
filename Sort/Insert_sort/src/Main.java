
public class Main {
    public static void main(String[] args) {
        int[] arr = {3,44,38,5,47,15,36,26,27,2,46};
        insert_sort(arr);
        Utils.printout(arr);
    }

    static int[] insert_sort(int arr[]) {
        for (int n = 1; n < arr.length; n++) {
            int x = arr[n];
            for (int i = n - 1; i >= 0; i--) {
                if (x > arr[i]) {
                    Utils.insert(arr, i + 1, n);
                    break;
                } else if (i == 0) {
                    Utils.insert(arr, i, n);
                }

            }
        }
        return arr;
    }

}
