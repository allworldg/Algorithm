

public class Main {
    public static void main(String[] args) {
        int arr[] = {2, 3, 8, 7, 1, 2, 2, 2, 7, 3, 9, 8, 2, 1, 4, 2, 4, 6, 9, 2};
        arr = count_sort(arr);
        Utils.printout(arr);
    }



    static int[] count_sort(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int num : arr){
            max = Math.max(max,num);//获得最大值
        }

        int[] count = new int[max+1];
        for(int num : arr){
            count[num]++;   //count计数组中每个数字出现的次数，数字大小作为下标，值为次数
        }

        int[] results = new int[arr.length];
        int index = 0;
        for(int i = 0; i<count.length ; i++){
            while(count[i]>0){
                results[index++] = i;
                count[i]--;
            }
        }
        return results;
  }
}
