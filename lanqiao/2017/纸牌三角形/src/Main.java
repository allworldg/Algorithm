public class Main{
    public static boolean[] visited;//访问
    public static int[] arr ;//三角卡牌位置
    public static int count = 0;
    public static void main(String[] args) {
        visited = new boolean[10];
        arr = new int[10];
        dfs(1);
        System.out.println(count/6);//旋转重复了三次，左右镜像重复两次
    }

    public static void dfs(int x){
        if(x==10){
            if(arr[1]+arr[2]+arr[4]+arr[6]==arr[1]+arr[3]+arr[5]+arr[9]
                    &&arr[1]+arr[2]+arr[4]+arr[6]==arr[6]+arr[7]+arr[8]+arr[9]){
                count++;
            }
            return;
        }
        //visited下标就是1-9的数字，通过判断这个下标是否被访问来达到将所有数字不重复的塞入到纸牌三角形
        for(int i=1;i<=9;i++){
            if(!visited[i]){
                visited[i]=true;//此点开始被访问
                arr[x] = i;
                dfs(x+1);
                visited[i]=false;//访问此点结束返回初始状态
            }


        }
    }
}