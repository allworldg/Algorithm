import java.io.BufferedInputStream;
import java.util.Scanner;

public class ≥–—πº∆À„ {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedInputStream(System.in));
		double[][] arr = new double[30][30];
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<=i;j++) {
				arr[i][j]= scanner.nextDouble(); 
			}
		}
		
		for(int i=1;i<arr.length;i++) {
			for(int j=0;j<=i;j++) {
				if(j==0) {
					arr[i][j]=arr[i-1][j]/2+arr[i][j]; 
				} else {
					arr[i][j]= arr[i-1][j]/2+arr[i-1][j-1]/2+arr[i][j]; 
				}
			}
		}
		
		double max = 0;
		double min = 1000000;
		
		for(int j=0;j<30;j++) {
			max = Math.max(max, arr[29][j]);
			min = Math.min(min, arr[29][j]);
		}	
		System.out.println(max);
		System.out.println(min);
		System.out.println((long)(2086458231*max/min));
	}
}
