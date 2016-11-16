package com.manoj.trees;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.manoj.common.PrintTreeData;


public class BinaryTreeTest {
  BuildBinaryTree<Integer> theTree;

  @Before
  public void initialize() {
    theTree = new BuildBinaryTree<Integer>();
    theTree.addNode(50, "Boss");
    theTree.addNode(25, "Vice President");
    theTree.addNode(15, "Office Manager");
    theTree.addNode(10, "Customer");
    theTree.addNode(30, "Secretary");
    theTree.addNode(75, "Sales Manager");
    theTree.addNode(85, "Salesman 1");
    theTree.addNode(60, "Salesman 1");
    theTree.addNode(65, "Sales Manager");
    PrintTreeData.printNode(theTree.root);
  }

  @Test
  public void findLeafElement() {
    MyTreeNode<Integer> findNode = theTree.findNode(75);
    Assert.assertEquals(findNode.getName(), "Sales Manager");
  }

  @Test
  public void findLastLeafElement() {
    MyTreeNode<Integer> findNode = theTree.findNode(10);
    Assert.assertEquals(findNode.getName(), "Customer");
  }

  @Test
  public void findRootElement() {
    MyTreeNode<Integer> findNode = theTree.findNode(50);
    Assert.assertEquals(findNode.getName(), "Boss");
  }

  @Test
  public void DeleteLeafElement() {
    theTree.delete(10);
    Assert.assertEquals(theTree.findNode(10), null);
    PrintTreeData.printNode(theTree.root);
  }

  @Test
  public void DeleteWithSingleChildElement() {
    theTree.delete(75);
    Assert.assertEquals(theTree.findNode(75), null);
    PrintTreeData.printNode(theTree.root);
  }

  @Test
  public void DeleteWithTwoChildrenElement() {
    theTree.delete(25);
    Assert.assertEquals(theTree.findNode(25), null);
    PrintTreeData.printNode(theTree.root);
  }

  @Test
  public void DeleteRootElement() {
    theTree.delete(50);
    Assert.assertEquals(theTree.findNode(50), null);
    PrintTreeData.printNode(theTree.root);
  }

  @Test
  public void printTraveseal() {
    System.out.println("***** INORDER TRAVERSAL ************");
    theTree.inOrderTraverseTree(theTree.findNode(50));

    System.out.println("***** Post Order TRAVERSAL ************");
    theTree.postOrderTraverseTree(theTree.findNode(50));

    System.out.println("***** PRE ORDER TRAVERSAL ************");
    theTree.preorderTraverseTree(theTree.findNode(50));

  }
}
