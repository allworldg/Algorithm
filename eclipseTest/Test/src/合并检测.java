public class ºÏ²¢¼ì²â {
	
	public static void main(String[] args) {
		int sum = 1000;
		int minn = 0x3f3f3f3f;
		int ans = 0, res = 0;
		for(int i = 1; i <= 1000; i ++) {
			if(sum % i == 0) {
				ans = sum / i + 10 * i;
			} else {
				ans = sum / i + 10 * i + 1;
			}
			if(ans < minn) {
				minn = ans;
				res = i;
			}
		}
		System.out.println(res);
	}

}
