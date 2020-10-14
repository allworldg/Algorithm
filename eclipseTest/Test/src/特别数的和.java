import java.util.Scanner;

public class 特别数的和 {
	public static void main(String[] args) {
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i=1 ;i<=n;i++) {
			if(exist(String.valueOf(i))) {
				sum+=i;
			}
		}
		System.out.println(sum);
		
	}
	public static boolean exist(String s) {
		if(s.indexOf("1")!=-1||s.indexOf("2")!=-1||s.indexOf("9")!=-1||s.indexOf("0")!=-1) {
			return true;
		}
		return false;
	}
}
