import java.util.Stack;

/**
 * @Classname DepthFirstSearch
 * @Description TODO
 * @Date 2020/8/25 12:00
 * @Created by 94493
 */
public class DepthFirstSearch {
    private int count = 0;
    private int[] counts;
    private boolean[] marked;
    private int start;//起点
    private int[] edgeTo;

    public DepthFirstSearch(Graph graph, int start) {
        marked = new boolean[graph.getV()];
        this.start = start;
        edgeTo = new int[graph.getV()];
        dfs(graph, start);
    }

    /**
     * 此构造器是为了遍历图的所有顶点
     * @param graph
     */
    public DepthFirstSearch(Graph graph){
        marked = new boolean[graph.getV()];
        counts = new int[graph.getV()];
        for(int i=0;i<graph.getV();i++){
            if(!hasPathTo(i)){
                count++;
                dfs1(graph,i);
            }
        }
    }

    public void dfs(Graph g, int v) {
        marked[v] = true;
        System.out.println(v);
        for (int i : g.adj(v)) {
            if (!marked[i]) {
                edgeTo[i] = v;
                dfs(g, i);
            }
        }
    }

    public void dfs1(Graph g, int v) {
        marked[v] = true;
        counts[v]=count;//记录每个点的连通分量，如果两个点连通则分量相等

        for (int i : g.adj(v)) {
            if (!marked[i]) {
                dfs1(g, i);
            }
        }
    }

    public boolean hasPathTo(int v) {
        return marked[v];
    }

    /**
     * 起点到目标点的路径
     * @param v
     * @return
     */
    public Stack<Integer> pathTo(int v) {
        if(!hasPathTo(v)){
            return null;//如果不可达直接返回null
        }

        Stack<Integer> path = new Stack<>();
        for(int i=v;i!=start;i=edgeTo[i]){
            path.push(i);
        }

        path.push(start);
        return path;
    }

    public boolean isConnected(int v,int w){
        return counts[v] == counts[w];
    }

}
