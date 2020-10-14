import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		Comparator<Integer> comparator  = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1-o2;
			}
			
		};
		arrayList.add(1);
		arrayList.add(3);
		arrayList.add(2);
		arrayList.sort(comparator);
		for(int a:arrayList) {
			System.out.println(a);
		}
		
	}

}
