import java.math.BigInteger;

public class ¸´ÊýÃÝ {
	public static void main(String[] args) {
		BigInteger a = new BigInteger("2");
		BigInteger b = new BigInteger("3");
		BigInteger c = new BigInteger("2");
		BigInteger d = new BigInteger("3");

		for (int i = 1; i < 123456; i++) {
			BigInteger temp1 = (a.multiply(c)).subtract(b.multiply(d));
			BigInteger temp2 = (a.multiply(d)).add(b.multiply(c));
			a = temp1;
			b = temp2;
		}

		if (b.compareTo(BigInteger.ZERO) >= 0) {
			System.out.println(a + "+" + b + "i");
		} else {
			System.out.println(a+""+b+"i");
		}

	}
}
