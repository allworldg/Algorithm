
public class 方格计数 {
	public static void main(String[] args) {
		int count = 0;
		for(int i=1;i<=1000;i++) {
			for(int j=1;j<=1000;j++) {
				if(Math.pow(i, 2)+Math.pow(j, 2)<=Math.pow(1000, 2)) {
					count++;
				}
			}
		}
		System.out.println(count*4);
	}
}
