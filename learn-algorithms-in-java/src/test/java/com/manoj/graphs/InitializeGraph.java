package com.manoj.graphs;

import org.junit.Before;

public class InitializeGraph {
  Graph graph;
  Vertex[] vertices;

  @Before
  public void initialize() {
    this.graph = new Graph();
    this.vertices = new Vertex[5];
    for (int i = 0; i < vertices.length; i++) {
      vertices[i] = new Vertex("label" + i);
      graph.addVertex(vertices[i], true);
    }
    for (int i = 0; i < vertices.length - 1; i++) {
      for (int j = i + 1; j < vertices.length; j++) {
        graph.addEdge(vertices[i], vertices[j], j + 2);
        graph.addEdge(vertices[i], vertices[j]);
        graph.addEdge(vertices[j], vertices[i]);
      }
    }

  }

}
