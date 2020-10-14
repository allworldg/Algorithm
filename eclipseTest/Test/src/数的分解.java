
public class 数的分解 {
	public static void main(String[] args) {
		int count = 0;
		for(int i=1;i<=2019;i++) {
			if(!isExist(String.valueOf(i))) {
				for(int j=i+1;j<=2019;j++) {
					if(!isExist(String.valueOf(j))) {
						for(int k=j+1;k<=2019;k++) {
							if(!isExist(String.valueOf(k))) {
								if(i+j+k==2019) {
									count++;
								}
							}
						}
					}
				}
			}
		}
		System.out.println(count);
	}
	public static boolean isExist(String s) {
		if(s.indexOf("2")!=-1||s.indexOf("4")!=-1) {
			return true;
		}
		return false;
	}
}
