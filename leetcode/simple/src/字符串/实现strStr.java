package 字符串;

/**
 * @Classname 实现strStr
 * @Description TODO
 * @Date 2020/10/4 22:08
 * @Created by 94493
 */
public class 实现strStr {
    public static void main(String[] args) {
        System.out.println( strStr1("mississippi","issip"));
    }

    /**
     * 采取滑动窗口
     * @param haystack
     * @param needle
     * @return
     */
    public static int strStr(String haystack, String needle) {
        if (needle.length() == 0 || needle == null) {
            return 0;
        }

        int n1 = haystack.length();
        int n2 = needle.length();

        for (int i = 0; i <= n1 - n2; i++) {
            if (haystack.substring(i, i + n2).equals(needle)) {
                return i;
            }
        }

        return -1;


    }

    /**
     * 双指针，分别扫描两个字符串，第一个字符对应上了在开始比较，否则往后遍历。比上个方法好点。
     * @param haystack
     * @param needle
     * @return
     */
    public static int strStr1(String haystack, String needle){
        if(needle.length()==0||needle==null){
            return 0;
        }

        int n1 = haystack.length();
        int n2 = needle.length();

        int start = 0;
        while(start<=n1-n2){
            while(start<=n1-n2&&haystack.charAt(start)!=needle.charAt(0)){
                start++;//找到第一个与needle首字母相同的位置
            }
            int needleCursor = 0;
            int haystackCursor = start;
            while(haystackCursor<n1&&needleCursor<n2&&haystack.charAt(haystackCursor)==needle.charAt(needleCursor)){
                haystackCursor++;
                needleCursor++;
            }
            if(needleCursor == n2 ){
                return start;
            }
            start++;

        }
        return -1;

    }
}
