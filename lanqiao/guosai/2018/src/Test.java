import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;

public class Test {
    public static InputReader in = new InputReader(new BufferedInputStream(System.in));
    public static PrintWriter out = new PrintWriter(System.out);
    public static int n, q, u, v, x, y;
    public static ArrayList<Integer>[] child = new ArrayList[100010];
    public static ArrayList<Integer>[] next = new ArrayList[100010];

    public static void main(String[] args) {
        n = in.nextInt();
        q = in.nextInt();
        for (int i = 1; i <= n; i++) {
            next[i] = new ArrayList<>();
            child[i] = new ArrayList<>();
        }
        for (int i = 1; i < n; i++) {
            u = in.nextInt();
            v = in.nextInt();
            next[u].add(v);
        }
        child[1] = getChild(1);
        while (q-- > 0) {
            x =in.nextInt();
            y = in.nextInt();
            if (child[x].contains(y)) {
                out.println("YES");
                out.flush();
            } else {
                out.println("NO");
                out.flush();
            }
        }
        out.close();
    }

    static ArrayList<Integer> getChild(int root) {
        int len = next[root].size();
        if(root == 6){
            System.out.println();
        }
        for (int i = 0; i < len; i++)
            child[root].addAll(getChild(next[root].get(i)));
        child[root].add(root);
        return child[root];
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public String nextLine() {
            String str = null;
            try {
                str = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public Double nextDouble() {
            return Double.parseDouble(next());
        }

        public BigInteger nextBigInteger() {
            return new BigInteger(next());
        }

    }
}