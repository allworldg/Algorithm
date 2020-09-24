/**
 * @Classname Main1
 * @Description 找第k小的数字
 * @Date 2020/9/24 12:36
 * @Created by 94493
 */
public class Main1 {
    public static int cursor = 0;
    public static int max = 0;
    public static void main(String[] args) {
        int k =4;
        int[] arr = {10,33,22,2,1,8,7,8,9};
        for(int i=0;i<k;i++){
            max(arr,i);//找出前三个的最大值和下标
        }
        for(int i=k;i<arr.length;i++){
            if(arr[i]<max){
                swap(arr,i);
                for(int j=0;j<3;j++){
                    max(arr,j);
                }
            }
        }

        System.out.println(arr[cursor]);

    }

    public static void swap(int[] arr,int a){
        max = arr[a];
        arr[cursor] = arr[a];
    }

    public static void max(int[] arr,int a){
        if(max<arr[a]){
            max = arr[a];
            cursor = a;
        }
    }



}
