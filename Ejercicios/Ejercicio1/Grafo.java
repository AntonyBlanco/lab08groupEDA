import java.util.*;
 
public class Grafo {
	
    public static void addEdge(LinkedList<LinkedList<Integer>> Adj, int u,int v){ 
        Adj.get(u).add(v);
    }
 
    public static void printadjacencylist(LinkedList<LinkedList<Integer> > adj)
    {
        for (int i = 0; i < adj.size(); ++i) {
            if (adj.get(i).size() != 0) {
                System.out.print(i + "->");
                for (int v : adj.get(i)) {  
                    System.out.print(v + " ");
                }
                System.out.println();
            }
        }
    }
 
    public static void main(String[] args) {
        int V = 5;
 
        LinkedList<LinkedList<Integer>> adj = new LinkedList<LinkedList<Integer>>();
 
        for (int i = 0; i < V; ++i) {
            adj.add(new LinkedList<Integer>());
        }
       
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 4);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 1, 4);
        addEdge(adj, 2, 3);
        addEdge(adj, 3, 4);
 
        printadjacencylist(adj);
    }
}
