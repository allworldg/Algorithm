import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @Classname Bfs
 * @Description TODO
 * @Date 2020/8/27 21:05
 * @Created by 94493
 */
public class Bfs {
    private boolean[] marked;
    private int[] edgeTo;
    private int start;

    public Bfs(Graph graph,int s){
        marked = new boolean[graph.getV()];
        edgeTo = new int[graph.getV()];
        this.start = s;
        bfs(graph,s);
    }

    public void bfs(Graph graph,int v)  {
        marked[v] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(v);

        while(!queue.isEmpty()){
            int w = queue.poll();
            for(int i:graph.adj(w)){
                if(!marked[i]){
                    edgeTo[i] = w;
                    marked[i] = true;
                    queue.offer(i);
                }
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

}
