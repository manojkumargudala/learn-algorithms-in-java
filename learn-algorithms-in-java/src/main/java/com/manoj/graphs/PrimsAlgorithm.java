package com.manoj.graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrimsAlgorithm {
  List<Vertex> navigatedVerticesList;
  List<Vertex> unNavigatedVerticesList;

  public PrimsAlgorithm() {
    navigatedVerticesList = new ArrayList<Vertex>();
    unNavigatedVerticesList = new ArrayList<Vertex>();
  }

  public List<Edge> primsAlgorithmMst(final Vertex vertex, final int vertexCount) {
    List<Edge> edgesListMst = new ArrayList<Edge>();
    Edge minEdge = getMinimumEdge(vertex, vertex.getNeighbors());
    navigatedVerticesList.add(vertex);
    Vertex sideVertex = vertex;
    while (minEdge != null) {
      System.out.println(minEdge);
      edgesListMst.add(minEdge);
      navigatedVerticesList.add(getVertex(minEdge, sideVertex));
      sideVertex = getVertex(minEdge, sideVertex);
      minEdge = getMinimumEdge(sideVertex, sideVertex.getNeighbors());
      addOtherEdges(sideVertex, sideVertex.getNeighborVertices());
    }
    return edgesListMst;
  }

  private Vertex getVertex(final Edge minEdge, final Vertex sideVertex) {
    if (minEdge.getOne() == sideVertex)
      return minEdge.getTwo();
    else
      return minEdge.getOne();
  }

  private void addOtherEdges(final Vertex sideVertex, final List<Vertex> list) {
    for (Vertex vertex : list) {
      if (!(vertex == sideVertex)) {
        unNavigatedVerticesList.add(vertex);
      }
    }
  }

  private Edge getMinimumEdge(final Vertex vertex, final ArrayList<Edge> neighbors) {
    List<Vertex> totalEdges = new ArrayList<>();
    totalEdges.addAll(unNavigatedVerticesList);
    Collections.sort(neighbors);
    for (Edge edgeNotPresent : neighbors) {
      if (!(navigatedVerticesList.contains(getVertex(edgeNotPresent, vertex)))) {
        return edgeNotPresent;
      }
    }
    return null;
  }
}
