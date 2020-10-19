import java.io.BufferedInputStream;
import java.util.Scanner;

public class ×Ö·û´®±àÂë {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedInputStream(System.in));
		String s = scanner.next();
		String result = "";
		int i = 0;
		while(i<s.length()-1) {
			int temp = Integer.parseInt(String.valueOf(s.charAt(i))+String.valueOf(s.charAt(i+1)));
			if(temp>26) {
				char c = (char) (s.charAt(i)-'1'+'A');
				result = result+String.valueOf(c);
				i++;
			}else {
				String string = String.valueOf(s.charAt(i))+String.valueOf(s.charAt(i+1));
				char c = 
			}
		}
	}
}
