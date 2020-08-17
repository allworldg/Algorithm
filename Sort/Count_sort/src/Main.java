import javax.print.attribute.standard.ReferenceUriSchemesSupported;

public class Main {
    public static void main(String[] args) {
        int arr[] = {101,109,107,103,108,102,103,110,107,103};
        arr = count_sort(arr);
        Utils.printout(arr);
    }


    static int[] count_sort(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : arr) {
            max = Math.max(max, num);//获得最大值
        }
        for (int num : arr) {
            min = Math.min(min, num);//获得最小值
        }

        int[] count = new int[max-min+1];

        for(int num:arr){
            count[num-min]++;//count数组计数
        }

        for(int i=1 ; i<count.length;i++){
            count[i] = count[i-1]+count[i];//计数变形，新元素的值是前面元素的累加和
        }

        int[] result = new int[arr.length];

        for(int j = 0 ; j<arr.length;j++){
            result[count[arr[j]-min]-1] = arr[j];
            count[arr[j]-min]--;
        }
        return result;

    }
}
