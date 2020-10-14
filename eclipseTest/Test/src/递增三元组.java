import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class 递增三元组 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedInputStream(System.in));
		int count = 0;
		int N = scanner.nextInt();
		int[] a = new int[N];
		int[] b = new int[N];
		int[] c = new int[N];
		
		for(int i=0;i<N;i++) {
			a[i] = scanner.nextInt(); 
		}
		
		for(int i=0;i<N;i++) {
			b[i]= scanner.nextInt(); 
		}
		
		for(int i=0;i<N;i++) {
			c[i] = scanner.nextInt();
		}
		
		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(a[i]>b[j]) {
					break;
				}
				for(int k = 0;k<N;k++) {
					if(b[j]>c[k]) {
						break;
					}
					count++;
					
				}
			}
		}
		System.out.println(count);
	}
}
