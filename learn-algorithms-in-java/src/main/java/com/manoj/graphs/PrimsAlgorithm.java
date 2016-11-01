package com.manoj.graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrimsAlgorithm {
  List<Vertex> navigatedVerticesList;
  List<Edge> unNavigatedVerticesList;

  public PrimsAlgorithm() {
    navigatedVerticesList = new ArrayList<Vertex>();
    unNavigatedVerticesList = new ArrayList<Edge>();
  }

  public List<Edge> primsAlgorithmMst(final Vertex vertex, final int vertexCount) {
    List<Edge> edgesListMst = new ArrayList<Edge>();
    Edge minEdge = getMinimumEdge(vertex, vertex.getNeighbors());
    navigatedVerticesList.add(getVertex(minEdge, vertex));
    Vertex sideVertex = vertex;
    while (minEdge != null) {
      System.out.println(minEdge);
      addOtherEdges(minEdge, sideVertex.getNeighbors());
      edgesListMst.add(minEdge);
      navigatedVerticesList.add(getVertex(minEdge, sideVertex));
      sideVertex = getVertex(minEdge, sideVertex);
      minEdge = getMinimumEdge(sideVertex, sideVertex.getNeighbors());
    }
    return edgesListMst;
  }

  private Vertex getVertex(final Edge minEdge, final Vertex sideVertex) {
    if (minEdge.getOne() == sideVertex)
      return minEdge.getTwo();
    else
      return minEdge.getOne();
  }

  private void addOtherEdges(final Edge minEdge, final ArrayList<Edge> arrayList) {
    for (Edge edge : arrayList) {
      if (!(edge == minEdge)) {
        unNavigatedVerticesList.add(edge);
      }

    }

  }

  private Edge getMinimumEdge(final Vertex vertex, final ArrayList<Edge> neighbors) {
    List<Edge> totalEdges = new ArrayList<>();
    totalEdges.addAll(unNavigatedVerticesList);
    if (neighbors != null) {
      totalEdges.addAll(neighbors);
    }
    Collections.sort(totalEdges);
    for (Edge edgeNotPresent : totalEdges) {
      if (!(navigatedVerticesList.contains(getVertex(edgeNotPresent, vertex)))) {
        return edgeNotPresent;
      }
    }
    return null;
  }
}
