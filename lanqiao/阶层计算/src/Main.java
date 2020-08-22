import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        ArrayList A = calculating(n);
        StringBuilder str = new StringBuilder();
        for (int i = A.size() - 1; i >= 0; i--) {
            str.append(A.get(i));
        }
        System.out.print(str);
    }

    public static ArrayList calculating(int n) {
        ArrayList<Integer> A = new ArrayList<Integer>();
        A.add(1);//首先将a设为1
        int highest = 1;//最高位数,比如999的最高位数为3
        for (int i = 2; i <= n; i++) {
            int carry = 0; //进位数，比如9+9，进位数为1
            int temp;
            for (int j = 0; j < highest; j++) {
                // 题目算法描述中说，将a乘以一个整数k变为将数组A的每一个元素都乘以k
                // A.get(j)是A数组位置为j的原有的数，你在乘以i之后，需要加上下一位的进位carry
                // 比如十位乘以i之后，得加上个位乘以i的进位
                // 例如987*3=2961，A=【7，8，9】，A.get(1)为位置为1的原有的数，它乘以3之后
                // ，需要加上7乘以3的进位2
                temp = A.get(j) * i + carry;
                // 取余数覆盖A数组中位置为j的元素
                // 例如987*3=2961，个位7乘以3之后，将1变为A数组新的个位，也就是覆盖0位置
                A.set(j, temp % 10);
                // 进位
                // 例如987*3=2961，个位7乘以3之后，进位carry为2
                carry = temp / 10;
            }
            // 当位数增加时，比如999*3=2997，它的最高位数就从3变成4，A数组就得增加新元素，长度增加
            while (carry != 0) {
                // 以999*3=2997为例，这里carry等于2，如果你奇怪这里为啥取余，
                // 那你想999*99=98901，这里的carry=98
                A.add(carry % 10);
                // 位数可能不只是增加了1，可能大于1，比如这里进位carry=98，
                // 位数就在999三位的基础上增加了两位，所以你得对carry进行整除，
                // 98/10等于9  8已经增加到A数组中了，9在下一次循环增加到A数组中
                carry = carry / 10;
                // 更新最高位数
                highest++;
            }
        }
        return A;
    }
}
