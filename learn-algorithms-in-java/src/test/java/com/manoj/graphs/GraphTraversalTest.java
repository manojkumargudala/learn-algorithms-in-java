package com.manoj.graphs;

import org.junit.Before;
import org.junit.Test;

public class GraphTraversalTest extends InitializeGraph {
  GraphTraversal grphTra;

  @Before
  public void intialize() {
    grphTra = new GraphTraversal();
  }

  @Test
  public void testBFS() {
    grphTra.depthFirstSearchTraverel(graph.getVertex("label1"));
    graph.resetVistedFlags();
  }

  @Test
  public void testBFSWithOtherLabel() {
    grphTra.depthFirstSearchTraverel(graph.getVertex("label2"));
    graph.resetVistedFlags();
  }

  @Test
  public void testBFS2() {
    Graph mygraph = new Graph();
    Vertex[] myVertices = new Vertex[13];
    for (int i = 0; i < myVertices.length; i++) {
      myVertices[i] = new Vertex("label" + i);
      mygraph.addVertex(myVertices[i], true);
    }
    mygraph.addEdge(myVertices[1], myVertices[2]);
    mygraph.addEdge(myVertices[1], myVertices[3]);
    mygraph.addEdge(myVertices[1], myVertices[4]);

    mygraph.addEdge(myVertices[2], myVertices[5]);
    mygraph.addEdge(myVertices[2], myVertices[6]);

    mygraph.addEdge(myVertices[4], myVertices[7]);
    mygraph.addEdge(myVertices[4], myVertices[8]);

    mygraph.addEdge(myVertices[5], myVertices[9]);
    mygraph.addEdge(myVertices[5], myVertices[10]);

    mygraph.addEdge(myVertices[7], myVertices[11]);
    mygraph.addEdge(myVertices[7], myVertices[12]);

    grphTra.depthFirstSearchTraverel(myVertices[1]);

    mygraph.resetVistedFlags();
    System.out.println("\n\n\n");
    grphTra.breadthFirstSearchTraverel(myVertices[1]);
  }
}
