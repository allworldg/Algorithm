import java.util.HashMap;
import java.util.HashSet;

public class ²»Í¬×Ó´® {
 public static void main(String[] args) {
	String s = "0100110001010001";
	HashSet<String> hashSet = new HashSet<>();
	for(int i=0;i<s.length();i++){
		for(int j=i+1;j<=s.length();j++) {
			String string = s.substring(i,j);
			hashSet.add(string);
		}
	}
	System.out.println(hashSet.size());
}
}
