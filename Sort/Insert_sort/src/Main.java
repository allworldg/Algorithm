

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,9};
        arr=Utils.insert(arr,0,arr.length-1);
        Utils.printout(arr);
    }
}
