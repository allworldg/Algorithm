import javax.print.attribute.UnmodifiableSetException;

/**
 * @Classname DepthFirstSearch
 * @Description TODO
 * @Date 2020/8/25 12:00
 * @Created by 94493
 */
public class DepthFirstSearch {
    private int count;
    private boolean[] marked;
    public DepthFirstSearch(Graph graph,int start){
        marked = new boolean[graph.getV()];
        dfs(graph,start);
    }
    public void dfs(Graph g,int v){
        marked[v] = true;
        System.out.println(v);
        for(int i:g.adj(v)){
            if(!marked[i]){
                dfs(g,i);
            }
        }
    }
}
