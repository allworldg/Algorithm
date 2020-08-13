import com.sun.org.apache.bcel.internal.generic.SWAP;

public class Main {
    public static void main(String[] args) {
        int[] arr={2,44,38,5,47,36,26,27};
        arr = select_sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

  static int[] select_sort(int[] arr) {
        int min;
        for (int N = arr.length - 1; N > 0; N--) {
            for (int i = 0; i < arr.length - 1; i++) {
                min=i;
                for(int j=i+1;j<=arr.length-1;j++){
                   if(arr[min]>arr[j]){
                       min=j;
                   }
                }
                Utils.swap(arr,min,i);
            }
        }
        return arr;
    }

}
