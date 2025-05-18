package baekjun.baek1608;

import org.junit.jupiter.api.Test;


public class GraphTest {

    @Test
    public void name() {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 1);
        g.DFS(2);
        System.out.println();
        System.out.println("~~~~~~~~~~");
        g.DFS(3);
        System.out.println();
        System.out.println("~~~~~~~~~~");

/*        g.DFS(3);
        System.out.println("~~~~~~~~~~");

        g.DFS(4);
        System.out.println("~~~~~~~~~~");

        g.DFS(1);
        System.out.println("~~~~~~~~~~");*/
    }
}