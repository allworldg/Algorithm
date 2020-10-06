package 字符串;

/**
 * @Classname v
 * @Description TODO
 * @Date 2020/10/4 14:44
 * @Created by 94493
 */
public class 字符串转换整数 {
    public static void main(String[] args) {
        myAtoi("42");
    }
    public static int myAtoi(String s) {
        s = s.trim();
        if (s.length() == 0 || s == null) {
            return 0;
        }

        if (!Character.isDigit(s.charAt(0)) && s.charAt(0) != '-' && s.charAt(0) != '+') {
            return 0;
        }
        long result = 0L;
        int start = !Character.isDigit(s.charAt(0)) ? 1 : 0;
        boolean negative = s.charAt(0) == '-';

        while (start < s.length() && Character.isDigit(s.charAt(start))) {
            result = result * 10 + (s.charAt(start++) - '0');
            if (!negative && result > Integer.MAX_VALUE) {
                result = Integer.MAX_VALUE;
                break;
            }

            if (negative && result > 1L + Integer.MAX_VALUE) {
                result = 1L + Integer.MAX_VALUE;
                break;
            }
        }

        return negative ? (int) -result : (int) result;


    }
}
