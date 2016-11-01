package com.manoj.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KrushkalAlgorithm {
  private final Map<Vertex, Vertex> parent;

  public KrushkalAlgorithm() {
    parent = new HashMap<Vertex, Vertex>();
  }

  public List<Edge> applyKrushalAlgortih(final List<Edge> list) {
    List<Edge> result = new ArrayList<Edge>();
    for (Edge edge : list) {
      Vertex one = findSet(edge.getOne());
      Vertex two = findSet(edge.getTwo());
      if (!one.equals(two)) {
        result.add(edge);
        System.out.println(edge.toString());
        union(one, two);
      }
    }
    return result;
  }

  private void union(final Vertex one, final Vertex two) {
    Vertex oneParent = findSet(one);
    Vertex twoParent = findSet(two);
    parent.put(twoParent, oneParent);
  }

  private Vertex findSet(final Vertex one) {
    if (!parent.containsKey(one)) {
      return one;
    }
    return findSet(parent.get(one));
  }
}
