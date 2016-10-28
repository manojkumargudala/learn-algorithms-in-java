package com.manoj.graphs;

import org.junit.Assert;
import org.junit.Test;

public class GraphTest extends InitializeGraph {

  @Test
  public void testVertexOne() {
    Assert.assertEquals(graph.getVertex("label1"), new Vertex("label1"));
  }

  @Test
  public void testVertexTwo() {
    Assert.assertEquals(graph.getVertex("label2"), new Vertex("label2"));
  }

  @Test
  public void testEdgeOneToTwoExists() {
    Assert.assertEquals(graph.addEdge(vertices[0], vertices[1]), false);
  }

  @Test
  public void testEdgeTwo() {
    Assert.assertEquals(graph.addEdge(vertices[1], vertices[4]), false);
  }

  @Test
  public void testEdgeWeight() {
    Assert.assertEquals(graph.getEdgeWeight(vertices[1], vertices[4]), 6);
  }
}
