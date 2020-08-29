/**
 * @Classname Main
 * @Description 把2019分解成3个各不相同的正整数之和，并且要求每个正整数都不包含2和4，有多少种分解方法。
 * @Date 2020/8/22 16:04
 * @Created by 94493
 */
public class Main {
    public static void main(String[] args) {
        int num = 2019;
        int count = 0;
        int k;
        for (int i = 1; i <= num; i++) {
            if (!exist(String.valueOf(i))) {
                for (int j = i + 1; j <= num; j++) {
                    if(!exist(String.valueOf(j))){
                        k = num-i-j;
                        if(k>j&&!exist(String.valueOf(k))){
                            count++;
                        }
                    }
                }
            }

        }
        System.out.println(count);
    }

    /**
     * 检查是否出现2或4
     *
     * @param s
     * @return
     */
    public static boolean exist(String s) {
        if (s.indexOf("2") != -1 || s.indexOf("4") != -1) {
            return true;
        }
        return false;
    }
}
