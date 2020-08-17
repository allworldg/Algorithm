public class Main {
    public static void main(String[] args) {
        System.out.println(Fas2(4));
    }

    /**
     * 非递归斐波那契
     *
     * @param n
     * @return
     */
    public static int Fas1(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        int a = 1, b = 1, c = 0;
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static int Fas2(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return Fas2(n - 1) + Fas2(n - 2);
    }


}
