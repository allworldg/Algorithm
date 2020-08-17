/**
 * 随机快速排序，每次随机找到枢纽，然后替换到数组的开头，再进行分区
 */
public class Main {
    public static void main(String[] args) {
        int arr[]={3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        arr = Random_quickSort(arr,0,arr.length-1);
        Utils.printout(arr);

    }

    /**
     * 对数组进行随机快速排序
     * @param arr
     * @param l
     * @param r
     * @return
     */
    static int[] Random_quickSort(int arr[],int l,int r){
        if(l<r){
            int m = partition(arr,l,r);
            Random_quickSort(arr,l,m-1);
            Random_quickSort(arr,m+1,r);
        }
        return arr;
    }

    /**
     *
     * @param arr
     * @param l
     * @param r
     * @return
     */
    static int partition(int arr[],int l,int r){
        int m = l;//起始s1 s2为空
        int n = (int)Math.floor(Math.random()*(r-l+1))+l;//随机下标作为枢纽位置
        int p = arr[n]; //确定枢纽
        Utils.swap(arr,n,l);//与首位呼唤，开始探索
        for(int k = l+1 ; k<=r ; k++){
            if(arr[k]<p){
                m++;
                Utils.swap(arr,m,k);
            }
        }
        Utils.swap(arr,l,m);
        return m;
    }
}

