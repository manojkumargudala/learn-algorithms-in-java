package com.manoj.graphs;

import org.junit.Test;

public class PrimsAlgorithimTest {

  @Test
  public void testBaseKruskalAlgorithm() {
    Graph mygraph = new Graph();
    Vertex[] myVertices = new Vertex[13];
    for (int i = 0; i < myVertices.length; i++) {
      myVertices[i] = new Vertex("label" + i);
      mygraph.addVertex(myVertices[i], true);
    }
    mygraph.addEdge(myVertices[1], myVertices[2], 2);
    mygraph.addEdge(myVertices[1], myVertices[3], 3);
    mygraph.addEdge(myVertices[1], myVertices[4], 4);

    mygraph.addEdge(myVertices[2], myVertices[5], 5);
    mygraph.addEdge(myVertices[2], myVertices[6], 6);
    mygraph.addEdge(myVertices[2], myVertices[9], 8);


    mygraph.addEdge(myVertices[4], myVertices[7], 10);
    mygraph.addEdge(myVertices[4], myVertices[8], 15);
    mygraph.addEdge(myVertices[8], myVertices[1], 1);
    mygraph.addEdge(myVertices[6], myVertices[9], 51);

    mygraph.addEdge(myVertices[5], myVertices[9], 101);
    mygraph.addEdge(myVertices[5], myVertices[10], 23);

    mygraph.addEdge(myVertices[7], myVertices[11], 26);
    mygraph.addEdge(myVertices[7], myVertices[12], 16);

    System.out.println("\n\n\n");

    PrimsAlgorithm ksmst = new PrimsAlgorithm();
    ksmst.primsAlgorithmMst(myVertices[1], myVertices.length);
  }

  @Test
  public void testKruskalAlgorithDefinded() {
    // for graph view go to
    // https://en.wikipedia.org/wiki/Minimum_spanning_tree#/media/File:Minimum_spanning_tree.svg
    Graph mygraph = new Graph();
    Vertex[] myVertices = new Vertex[11];
    for (int i = 0; i < myVertices.length; i++) {
      myVertices[i] = new Vertex("V" + i);
      mygraph.addVertex(myVertices[i], true);
    }

    mygraph.addEdge(myVertices[1], myVertices[2], 8);
    mygraph.addEdge(myVertices[1], myVertices[3], 10);
    mygraph.addEdge(myVertices[1], myVertices[5], 9);
    mygraph.addEdge(myVertices[1], myVertices[6], 7);
    mygraph.addEdge(myVertices[1], myVertices[8], 8);
    mygraph.addEdge(myVertices[1], myVertices[9], 9);

    mygraph.addEdge(myVertices[2], myVertices[3], 18);
    mygraph.addEdge(myVertices[2], myVertices[9], 9);
    mygraph.addEdge(myVertices[2], myVertices[10], 9);


    mygraph.addEdge(myVertices[3], myVertices[4], 4);
    mygraph.addEdge(myVertices[3], myVertices[5], 3);


    mygraph.addEdge(myVertices[4], myVertices[5], 1);
    mygraph.addEdge(myVertices[4], myVertices[6], 4);


    mygraph.addEdge(myVertices[6], myVertices[7], 9);
    mygraph.addEdge(myVertices[6], myVertices[8], 9);


    mygraph.addEdge(myVertices[7], myVertices[8], 2);
    mygraph.addEdge(myVertices[7], myVertices[9], 4);
    mygraph.addEdge(myVertices[7], myVertices[10], 6);

    mygraph.addEdge(myVertices[8], myVertices[9], 2);
    mygraph.addEdge(myVertices[9], myVertices[10], 3);
    PrimsAlgorithm ksmst = new PrimsAlgorithm();
    ksmst.primsAlgorithmMst(myVertices[1], mygraph.getEdges().size());
  }
}
