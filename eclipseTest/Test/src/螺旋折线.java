import java.io.BufferedInputStream;
import java.util.Scanner;

public class 螺旋折线 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedInputStream(System.in));
		long x = scanner.nextLong();
		long y = scanner.nextLong();
		long distance = 0;
		
		long layer = Math.max(Math.abs(x), Math.abs(y));//查看坐标在第几层
		long n = layer-1;
		if(x>=y) {
			distance = 8*(1+layer)*layer/2-(x+layer+y+layer);
		} else {
			distance = 8*(1+n)*n/2+(x+n+y+n);
		}
		
		System.out.println(distance);
	}
}
