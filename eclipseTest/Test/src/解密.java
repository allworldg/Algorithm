
public class Ω‚√‹ {
	public static void main(String[] args) {
		String string = "aynlAYNL";
		String[] a = new String[4];
		String[] b = new String[4];
		int j = 0;
		int k = 0;
		for(int i=0;i<string.length();i++) {
			if(i%2==0) {
				a[j++] = String.valueOf(string.charAt(i));
			}else {
				b[k++] = String.valueOf(string.charAt(i));
			}
		}
		
		String s = "ylLY";
		for(int i=0;i<s.length();i++){
			String temp = String.valueOf(s.charAt(i));
			for(int z = 0;z<b.length;z++) {
				if(b[z].equals(temp)) {
					System.out.print(a[z]);
					break;
				}
			}
		}
	}
}
