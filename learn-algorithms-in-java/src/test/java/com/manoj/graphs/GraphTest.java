package com.manoj.graphs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GraphTest {
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
