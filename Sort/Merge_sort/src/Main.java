public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 10};
        nums =  mergesort(nums, 0, nums.length - 1);
        Utils.printout(nums);
    }

    /**
     * 归并排序（merge_sort）
     *
     * @param arr 需要排序的数组 从小到大
     * @param l   数组左侧    left
     * @param r   数组右侧    right
     * @return
     */
    static int[] mergesort(int[] arr, int l, int r) {
        if (l == r) {
            return new int[]{arr[l]};
        }
        int mid = (l + r) / 2;
        int[] leftArr = mergesort(arr, l, mid); //左侧有序数组
        int[] rightArr = mergesort(arr, mid + 1, r); //右侧有序数组
        int[] newArr = new int[leftArr.length + rightArr.length]; //新的有序数组

        int m = 0, i = 0, j = 0;
        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] < rightArr[j]) {
                newArr[m++] = leftArr[i++];
            } else {
                newArr[m++] = rightArr[j++];
            }
        }

            while (j < rightArr.length) {
                newArr[m++] = rightArr[j++];
            }

            while (i < leftArr.length) {
                newArr[m++] = leftArr[i++];
            }

        return newArr;
    }
}
