package com.manoj.graphs;

public class Edge implements Comparable<Edge> {

	private Vertex edgeOneVertex, edgeTwoVertex;
	private int weight;

	public Edge(Vertex one, Vertex two) {
		this(one, two, 1);
	}

	public Edge(Vertex one, Vertex two, int weight) {
		this.edgeOneVertex = (one.getLabel().compareTo(two.getLabel()) <= 0) ? one : two;
		this.edgeTwoVertex = (this.edgeOneVertex == one) ? two : one;
		this.weight = weight;
	}

	public Vertex getNeighbor(Vertex current) {
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

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int compareTo(Edge other) {
		return this.weight - other.weight;
	}

	public String toString() {
		return "({" + edgeOneVertex + ", " + edgeTwoVertex + "}, " + weight + ")";
	}

	public int hashCode() {
		return (edgeOneVertex.getLabel() + edgeTwoVertex.getLabel()).hashCode();
	}

	public boolean equals(Object other) {
		if (!(other instanceof Edge)) {
			return false;
		}

		Edge e = (Edge) other;

		return e.edgeOneVertex.equals(this.edgeOneVertex) && e.edgeTwoVertex.equals(this.edgeTwoVertex);
	}
}
