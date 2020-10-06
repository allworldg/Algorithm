package 字符串;

/**
 * @Classname 外观数列
 * @Description TODO
 * @Date 2020/10/5 16:23
 * @Created by 94493
 */
public class 外观数列 {
    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }
    public static String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }

        StringBuffer sb = new StringBuffer();
        String str = countAndSay(n - 1);
        int start = 0;
        for (int i = 1; i <= str.length(); i++) {
            if (i == str.length()) {
                sb.append(i - start).append(str.charAt(start));//如果扫描到末尾直接拼接几个几
            } else if (str.charAt(i) != str.charAt(start)) {//如果i指向的数字不等于start指的数字，说明可以拼接之前的数字
                sb.append(i - start).append(str.charAt(start));
                start = i;
            }
        }

        return sb.toString();
    }
}
