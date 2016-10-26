package com.manoj.trees;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.manoj.common.PrintTreeData;

public class BstSearchingTest {

  BuildBinaryTree<Integer> theTree;
  BstSearching bstSearch;

  @Before
  public void initialize() {
    theTree = new BuildBinaryTree<Integer>();
    bstSearch = new BstSearching();
    theTree.addNode(50, "Boss");
    theTree.addNode(25, "Vice President");
    theTree.addNode(15, "Office Manager");
    theTree.addNode(10, "Customer");
    theTree.addNode(30, "Secretary");
    theTree.addNode(75, "Sales Manager");
    theTree.addNode(85, "Salesman 1");
    PrintTreeData.printNode(theTree.root);
  }

  @Test
  public void findLeafElement() {
    MyTreeNode<Integer> findNode = bstSearch.breadthFirstTraversal(theTree.root, 75);
    Assert.assertEquals(findNode.getName(), "Sales Manager");
  }

  @Test
  public void findLastLeafElement() {
    MyTreeNode<Integer> findNode = bstSearch.breadthFirstTraversal(theTree.root, 10);
    Assert.assertEquals(findNode.getName(), "Customer");
  }

  @Test
  public void findRootElement() {
    MyTreeNode<Integer> findNode = bstSearch.breadthFirstTraversal(theTree.root, 50);
    Assert.assertEquals(findNode.getName(), "Boss");
  }

  @Test
  public void findLeafElementUsingDFS() {
    MyTreeNode<Integer> findNode = bstSearch.depthFirstTraversal(theTree.root, 75);
    Assert.assertEquals(findNode.getName(), "Sales Manager");
  }

  @Test
  public void findLastLeafElementUsingDFS() {
    MyTreeNode<Integer> findNode = bstSearch.depthFirstTraversal(theTree.root, 10);
    Assert.assertEquals(findNode.getName(), "Customer");
  }

  @Test
  public void findRootElementUsingDFS() {
    MyTreeNode<Integer> findNode = bstSearch.depthFirstTraversal(theTree.root, 50);
    Assert.assertEquals(findNode.getName(), "Boss");
  }
}

