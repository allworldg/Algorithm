import java.util.ArrayList;
import java.util.Stack;

/**
 * @Classname Main
 * @Description DFS
 * @Date 2020/8/22 16:41
 * @Created by 94493
 */
public class Main {

    public static void main(String[] args) {
       Graph graph = new Graph();
        System.out.println( graph.toString());
       DepthFirstSearch depthFirstSearch = new DepthFirstSearch(graph);
        System.out.println(depthFirstSearch.isConnected(0,1));


    }


}
