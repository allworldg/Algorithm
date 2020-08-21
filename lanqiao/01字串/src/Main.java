/**
 * @Classname Main
 * @Description 对于长度为5位的一个01串，每一位都可能是0或1，一共有32种可能。它们的前几个是：
 * <p>
 * 00000
 * <p>
 * 00001
 * <p>
 * 00010
 * <p>
 * 00011
 * <p>
 * 00100
 * <p>
 * 请按从小到大的顺序输出这32种01串。
 * @Date 2020/8/20 11:07
 * @Created by 94493
 */
public class Main {
    public static void main(String[] args) {
        for(int i=0;i<32;i++){
            String str = Integer.toBinaryString(i);
            int num = str.length();
            for(int j=0;j<5-num;j++){
                str = "0"+str;
            }
            System.out.println(str);
        }
    }
}
