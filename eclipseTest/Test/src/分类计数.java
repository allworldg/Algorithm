
public class 分类计数 {
	public static void main(String[] args) {
		String s = "1+a=Aab";
		int number = 0;
		int big = 0;
		int small = 0;
		
		for(int i=0;i<s.length();i++) {
			if(Character.isDigit(s.charAt(i))){
				number++;
			}else if(Character.isUpperCase(s.charAt(i))) {
				big++;
			} else if(Character.isLowerCase(s.charAt(i))) {
				small++;
			}
		}
		
		System.out.println(big);
		System.out.println(small);
		System.out.println(number);
	}
}
