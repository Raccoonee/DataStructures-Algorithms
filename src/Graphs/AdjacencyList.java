package Graphs;

public class AdjacencyList {
    // Adjacency List = An array/arraylist of linkedLists
    // Each linkedList has a unique node at the head.
    // All adjacent neighbors to that node are added to that node's linkedList

    // Adjacency list of a graph
    // Time complexity: O(V)
    // Space complexity: O(V + E) V = vertices of the graph E = # of edges

    // Graphs.Node is a point on the graph and an edge is a line connecting a node.

    public static void main(String[] args) {

        GraphList graph = new GraphList();

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        graph.print();
    }

}
