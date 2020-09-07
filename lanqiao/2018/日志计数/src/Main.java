import java.util.*;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2020/9/6 11:23
 * @Created by 94493
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();//日志数量
        int D = scanner.nextInt();//在N时间内属于热帖
        int K = scanner.nextInt();//k个赞
        ArrayList<Integer>[] arr = new ArrayList[100000 + 1];
        for(int i=1;i<arr.length;i++){
            arr[i] = new ArrayList<>();
        }
        for (int i = 1; i <= N; i++) {
            int ts = scanner.nextInt();
            int id = scanner.nextInt();

            arr[id].add(ts);
        }


        for (int i = 1; i < arr.length; i++) {
            if (arr[i].size() >= K) {//如果对应的帖子总点赞次数就少于k，自然不用考虑
                Collections.sort(arr[i]);//点赞时间排序
                int start = 0;
                int end = 1;
                int count = 0;
                while (start < arr[i].size() && end < arr[i].size()) {
                    if ((arr[i].get(end) - arr[i].get(start)) < N) {
                        count = Math.max(count, end - start + 1);
                        end++;
                    } else {
                        start++;
                    }
                    if (count >= K){
                        System.out.println(i);
                        break;
                    }

                }
            }

        }

    }
}

