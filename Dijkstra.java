
// 84.	Create a program to find the shortest path in a graph using Dijkstra's algorithm.

import java.util.*;

public class Dijkstra {
    static void dijkstra(int[][] graph, int src) {
        int V = graph.length;
        int[] dist = new int[V];
        boolean[] visited = new boolean[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        for (int i = 0; i < V - 1; i++) {
            int u = -1;
            for (int v = 0; v < V; v++)
                if (!visited[v] && (u == -1 || dist[v] < dist[u])) u = v;

            visited[u] = true;
            for (int v = 0; v < V; v++)
                if (graph[u][v] != 0 && dist[u] + graph[u][v] < dist[v])
                    dist[v] = dist[u] + graph[u][v];
        }

        for (int i = 0; i < V; i++)
            System.out.println("Distance from " + src + " to " + i + " is " + dist[i]);
    }

    public static void main(String[] args) {
        int[][] graph = {
            {0, 10, 0, 0, 5},
            {0, 0, 1, 0, 2},
            {0, 0, 0, 4, 0},
            {7, 0, 6, 0, 0},
            {0, 3, 9, 2, 0}
        };
        dijkstra(graph, 0);
    }
}
