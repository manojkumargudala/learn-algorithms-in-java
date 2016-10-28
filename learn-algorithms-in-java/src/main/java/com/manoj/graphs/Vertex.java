package com.manoj.graphs;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

  private final ArrayList<Edge> neighborhood;
  private final String label;
  private boolean isVisted;

  public Vertex(final String label) {
    this.label = label;
    this.neighborhood = new ArrayList<Edge>();
    this.setVisted(false);
  }

  public void addNeighbor(final Edge edge) {
    if (this.neighborhood.contains(edge)) {
      return;
    }

    this.neighborhood.add(edge);
  }

  public boolean containsNeighbor(final Edge other) {
    return this.neighborhood.contains(other);
  }

  public Edge getNeighbor(final int index) {
    return this.neighborhood.get(index);
  }

  Edge removeNeighbor(final int index) {
    return this.neighborhood.remove(index);
  }

  public void removeNeighbor(final Edge e) {
    this.neighborhood.remove(e);
  }

  public int getNeighborCount() {
    return this.neighborhood.size();
  }

  public String getLabel() {
    return this.label;
  }

  @Override
  public String toString() {
    return "Vertex " + label;
  }

  @Override
  public int hashCode() {
    return this.label.hashCode();
  }

  @Override
  public boolean equals(final Object other) {
    if (!(other instanceof Vertex)) {
      return false;
    }

    Vertex v = (Vertex) other;
    return this.label.equals(v.label);
  }

  public ArrayList<Edge> getNeighbors() {
    return new ArrayList<Edge>(this.neighborhood);
  }

  public List<Vertex> getNeighborVertices() {
    List<Vertex> vertices = new ArrayList<Vertex>();
    for (Edge edge : getNeighbors()) {
      if (edge.getOne().equals(this)) {
        vertices.add(edge.getTwo());
      } else {
        vertices.add(edge.getOne());
      }
    }

    return vertices;
  }

  public boolean isVisted() {
    return isVisted;
  }

  public void setVisted(final boolean isVisted) {
    this.isVisted = isVisted;
  }

}
