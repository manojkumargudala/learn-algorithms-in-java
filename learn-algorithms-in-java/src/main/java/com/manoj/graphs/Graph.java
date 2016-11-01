package com.manoj.graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class Graph {

  private final HashMap<String, Vertex> vertices;
  private final HashMap<Integer, Edge> edges;

  public Graph() {
    this.vertices = new HashMap<String, Vertex>();
    this.edges = new HashMap<Integer, Edge>();
  }

  public Graph(final ArrayList<Vertex> vertices) {
    this.vertices = new HashMap<String, Vertex>();
    this.edges = new HashMap<Integer, Edge>();

    for (Vertex v : vertices) {
      this.vertices.put(v.getLabel(), v);
    }

  }

  public boolean addEdge(final Vertex one, final Vertex two) {
    return addEdge(one, two, 1);
  }

  public int getEdgeWeight(final Vertex one, final Vertex two) {
    for (Entry<Integer, Edge> edge : edges.entrySet()) {
      if ((edge.getValue().getOne() == one && edge.getValue().getTwo() == two)
          || (edge.getValue().getOne() == two && edge.getValue().getTwo() == one)) {
        return edge.getValue().getWeight();
      }
    }
    return -1;
  }

  public boolean addEdge(final Vertex one, final Vertex two, final int weight) {
    if (one.equals(two)) {
      return false;
    }

    // ensures the Edge is not in the Graph
    Edge e = new Edge(one, two, weight);
    if (edges.containsKey(e.hashCode())) {
      return false;
    }

    // and that the Edge isn't already incident to one of the vertices
    else if (one.containsNeighbor(e) || two.containsNeighbor(e)) {
      return false;
    }

    edges.put(e.hashCode(), e);
    one.addNeighbor(e);
    two.addNeighbor(e);
    return true;
  }

  public boolean containsEdge(final Edge e) {
    if (e.getOne() == null || e.getTwo() == null) {
      return false;
    }

    return this.edges.containsKey(e.hashCode());
  }

  public Edge removeEdge(final Edge e) {
    e.getOne().removeNeighbor(e);
    e.getTwo().removeNeighbor(e);
    return this.edges.remove(e.hashCode());
  }

  public boolean containsVertex(final Vertex vertex) {
    return this.vertices.get(vertex.getLabel()) != null;
  }

  public Vertex getVertex(final String label) {
    return vertices.get(label);
  }

  public boolean addVertex(final Vertex vertex, final boolean overwriteExisting) {
    Vertex current = this.vertices.get(vertex.getLabel());
    if (current != null) {
      if (!overwriteExisting) {
        return false;
      }

      while (current.getNeighborCount() > 0) {
        this.removeEdge(current.getNeighbor(0));
      }
    }

    vertices.put(vertex.getLabel(), vertex);
    return true;
  }

  public Vertex removeVertex(final String label) {
    Vertex v = vertices.remove(label);
    while (v.getNeighborCount() > 0) {
      this.removeEdge(v.getNeighbor((0)));
    }
    return v;
  }

  public Set<String> vertexKeys() {
    return this.vertices.keySet();
  }

  public List<Edge> getEdges() {
    List<Edge> arrayList = new ArrayList<Edge>(this.edges.values());
    Collections.sort(arrayList);
    return arrayList;
  }

  public void resetVistedFlags() {
    for (Entry<String, Vertex> vertex : vertices.entrySet()) {
      vertex.getValue().setVisted(false);
    }
  }
}
