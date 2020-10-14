import java.util.Scanner;

public class 后缀表达式 {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] arr = new int[N+M+1];
		int sum = 0;
		int min = Integer.MAX_VALUE;
		for(int i=0;i<N+M+1;i++) {
			arr[i]= sc.nextInt();
			min = Math.min(min, arr[i]);
			sum+=arr[i];
		}
		
		System.out.println(sum-2*min);
		
		
	}
}
