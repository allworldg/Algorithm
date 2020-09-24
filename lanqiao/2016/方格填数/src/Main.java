import java.util.Arrays;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/9/16 14:59
 * @Created by 94493
 */
public class Main {
    static int[] nums = new int[11];
    static boolean[] visited = new boolean[10];
    static int count = 0;
    public static void main(String[] args) {
        dfs(1);
        System.out.println(count);
    }

    public static void dfs(int step){


        //判断与左侧是否是连续的数字(右侧就不用考虑了）
        if(step!=1&&step!=2&&step!=5&&step!=9){
            if(Math.abs(nums[step-1]-nums[step-2])==1)
                return;
        }

        //判断与上侧
        if(step>=6){
            if(Math.abs(nums[step-1]-nums[step-5])==1)
                return;
        }

        //右上
        if(step>=5&&step!=8){
            if(Math.abs(nums[step-1]-nums[step-4])==1)
                return;
        }

        //左上
        if(step>=7&&step!=9){
            if(Math.abs(nums[step-1]-nums[step-6])==1)
                return;
        }

        if(step == 11){
            count++;
            System.out.println(Arrays.toString(nums));
            return;
        }

        for(int i=0;i<=9;i++){
            if(!visited[i]){
                visited[i]=true;
                nums[step] = i;
                dfs(step+1);
                visited[i]=false;
            }
        }

    }


}
