/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/9/15 10:13
 * @Created by 94493
 */
public class Main {
    public static int[] nums = new int[10];
    public static boolean[] visited = new boolean[10];
    public static int count = 0;
    public static void main(String[] args) {
        dfs(1);
        System.out.println(count);
    }

    public static void dfs(int step){
        if(step==10){
            if(nums[1]+nums[2]*1.0/nums[3]+((nums[4]*100+nums[5]*10+nums[6])*1.0)/(nums[7]*100+nums[8]*10+nums[9])==10){
                count++;
                for(int i:nums){
                    System.out.print(i);
                }
                System.out.println();
            }
        } else {
            for(int i=1;i<=9;i++){
                if(!visited[i]){
                    visited[i] = true;
                    nums[step] = i;
                    dfs(step+1);
                    visited[i] = false;
                }
            }
        }

    }
}
