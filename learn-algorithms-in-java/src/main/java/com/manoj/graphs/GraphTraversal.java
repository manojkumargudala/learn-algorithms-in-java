package com.manoj.graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GraphTraversal {
  public void depthFirstSearchTraverel(final Vertex startVertex) {
    startVertex.setVisted(true);
    Stack<Vertex> stack = new Stack<Vertex>();
    stack.add(startVertex);
    while (!stack.isEmpty()) {
      Vertex currentVertex = stack.pop();
      System.out.println(currentVertex.toString());
      for (Vertex neighbourVerex : currentVertex.getNeighborVertices()) {
        if (!neighbourVerex.isVisted()) {
          stack.push(neighbourVerex);
          neighbourVerex.setVisted(true);
        }
      }

    }
  }

  public void breadthFirstSearchTraverel(final Vertex startVertex) {
    startVertex.setVisted(true);
    Queue<Vertex> queue = new LinkedList<Vertex>();
    queue.add(startVertex);
    while (!queue.isEmpty()) {
      Vertex currentVertex = queue.poll();
      System.out.println(currentVertex.toString());
      for (Vertex neighbourVerex : currentVertex.getNeighborVertices()) {
        if (!neighbourVerex.isVisted()) {
          queue.add(neighbourVerex);
          neighbourVerex.setVisted(true);
        }
      }

    }
  }
}
