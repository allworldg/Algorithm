import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class 日志统计 {
	public static int K;
	public static int D;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedInputStream(System.in));
		int N = scanner.nextInt();
		D = scanner.nextInt();
		K = scanner.nextInt();

		ArrayList<Integer>[] arrayLists = new ArrayList[100000];
		for (int i = 0; i < N; i++) {
			int ts = scanner.nextInt();
			int id = scanner.nextInt();
			if (arrayLists[id] != null) {
				arrayLists[id].add(ts);
			} else {
				arrayLists[id] = new ArrayList<>();
				arrayLists[id].add(ts);
			}
		}

		for (int i = 0; i < arrayLists.length; i++) {
			if (arrayLists[i] != null) {
				arrayLists[i].sort(null);
				ArrayList<Integer> arrayList = arrayLists[i];
				if(isHot(arrayList)) {
					System.out.println(i);
				}
			}
		}
	}

	public static boolean isHot(ArrayList<Integer> arrayList) {
		if(arrayList.size()<K) {
			return false;
		}
		
		for(int i = 0;i<arrayList.size();i++) {
			int j = i;
			for(;j<arrayList.size()-1;j++) {
				if(arrayList.get(j+1)-arrayList.get(j)>9) {
					break;
				}
			}
			if(j-i+1<K) {
				return false;
			} else {
				return true;
			}
		}
		return true;
	}
}
