package com.manoj.graphs;

public class Edge implements Comparable<Edge> {

  private final Vertex edgeOneVertex, edgeTwoVertex;
  private int weight;

  public Edge(final Vertex one, final Vertex two) {
    this(one, two, 1);
  }

  public Edge(final Vertex one, final Vertex two, final int weight) {
    this.edgeOneVertex = (one.getLabel().compareTo(two.getLabel()) <= 0) ? one : two;
    this.edgeTwoVertex = (this.edgeOneVertex == one) ? two : one;
    this.weight = weight;
  }

  public Vertex getNeighbor(final Vertex current) {
    if (!(current.equals(edgeOneVertex) || current.equals(edgeTwoVertex))) {
      return null;
    }

    return (current.equals(edgeOneVertex)) ? edgeTwoVertex : edgeOneVertex;
  }

  public Vertex getOne() {
    return this.edgeOneVertex;
  }

  public Vertex getTwo() {
    return this.edgeTwoVertex;
  }

  public int getWeight() {
    return this.weight;
  }

  public void setWeight(final int weight) {
    this.weight = weight;
  }

  @Override
  public int compareTo(final Edge other) {
    return this.weight - other.weight;
  }

  @Override
  public String toString() {
    return "({" + edgeOneVertex + ", " + edgeTwoVertex + "}, " + weight + ")";
  }

  @Override
  public int hashCode() {
    return (edgeOneVertex.getLabel() + edgeTwoVertex.getLabel()).hashCode();
  }

  @Override
  public boolean equals(final Object other) {
    if (!(other instanceof Edge)) {
      return false;
    }

    Edge e = (Edge) other;

    return e.edgeOneVertex.equals(this.edgeOneVertex) && e.edgeTwoVertex.equals(this.edgeTwoVertex);
  }
}
