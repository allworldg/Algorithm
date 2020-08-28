import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Classname EdgeNode
 * @Description
 * @Date 2020/8/22 16:47
 * @Created by 94493
 */
public class Graph {
    private int V;  //顶点数目
    private int E;  //边数目
    private ArrayList<Integer>[] adj;//邻接表
    Scanner scanner = new Scanner(System.in);

    public Graph() {
        this(6);
        addEdge(0,1);
        addEdge(1,2);
        addEdge(2,3);
        addEdge(2,4);
    }

    public Graph(int v) {
        this.V = v;
        this.E = 0;
        adj = new ArrayList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new ArrayList<>();
        }
    }

    public Graph(int V, int E) {
        this(V);
        for (int i = 0; i < E; i++) {
            System.out.println("请输入第 " + (i + 1) + "边的两个顶点");
            int v = scanner.nextInt();
            int w = scanner.nextInt();
            addEdge(v, w);
        }
    }


    public void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
        E++;
    }

    public int getV() {
        return V;
    }

    public Iterable<Integer> adj(int v) {
        return adj[v];
    }

    public String toString() {
        String s = this.V + " vertices " + this.E + " edges\n";
        for (int i = 0; i < V; i++) {
            s = s + i + ": ";
            for (int w : adj[i]) {
                s = s + w + " ";
            }
            s = s + "\n";
        }
        return s;
    }


}
