import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class 外卖店优先级 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int T = sc.nextInt();
		HashSet<Integer> hashSet = new HashSet<>();
		int[][] dingdan = new int[N+1][T+1];
		int[] sum = new int[T+1];
		int count = 0;
		
		for(int i=1;i<=M;i++) {
			int ts = sc.nextInt();
			int id = sc.nextInt();
			if(ts<=T)
			dingdan[id][ts]++;
		}
		
		for(int i=1;i<dingdan.length;i++) {
			for(int j=1;j<dingdan[i].length;j++) {
				if(dingdan[i][j]==0) {
					sum[i] = Math.max(0, sum[i]-1);
				} else {
					sum[i] = sum[i]+dingdan[i][j]*2; 
				}
			}
		}
		for(int i=1;i<sum.length;i++) {
			if(sum[i]>5) {
				hashSet.add(i);
			}else if(sum[i]<=3&&hashSet.contains(i)) {
				hashSet.remove(i);
			}
		} 
		System.out.println(hashSet.size());
	}
	
}
