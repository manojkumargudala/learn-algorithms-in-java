package com.manoj.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.manoj.trees.MyTreeNode;

public class PrintTreeData {

  public static <T extends Comparable<T>> void printNode(final MyTreeNode<T> root) {
    int maxLevel = PrintTreeData.maxLevel(root);

    printNodeInternal(Collections.singletonList(root), 1, maxLevel);
  }

  private static <T extends Comparable<T>> void printNodeInternal(final List<MyTreeNode<T>> nodes,
      final int level, final int maxLevel) {
    if (nodes.isEmpty() || PrintTreeData.isAllElementsNull(nodes))
      return;

    int floor = maxLevel - level;
    int endgeLines = (int) Math.pow(2, (Math.max(floor - 1, 0)));
    int firstSpaces = (int) Math.pow(2, (floor)) - 1;
    int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;

    PrintTreeData.printWhitespaces(firstSpaces);

    List<MyTreeNode<T>> newNodes = new ArrayList<MyTreeNode<T>>();
    for (MyTreeNode<T> node : nodes) {
      if (node != null) {
        System.out.print(node.getData());
        // System.out.print(node);
        newNodes.add(node.getLeft());
        newNodes.add(node.getRight());
      } else {
        newNodes.add(null);
        newNodes.add(null);
        System.out.print(" ");
      }

      PrintTreeData.printWhitespaces(betweenSpaces);
    }
    System.out.println("");

    for (int i = 1; i <= endgeLines; i++) {
      for (int j = 0; j < nodes.size(); j++) {
        PrintTreeData.printWhitespaces(firstSpaces - i);
        if (nodes.get(j) == null) {
          PrintTreeData.printWhitespaces(endgeLines + endgeLines + i + 1);
          continue;
        }

        if (nodes.get(j).getLeft() != null)
          System.out.print("/");
        else
          PrintTreeData.printWhitespaces(1);

        PrintTreeData.printWhitespaces(i + i - 1);

        if (nodes.get(j).getRight() != null)
          System.out.print("\\");
        else
          PrintTreeData.printWhitespaces(1);

        PrintTreeData.printWhitespaces(endgeLines + endgeLines - i);
      }

      System.out.println("");
    }

    printNodeInternal(newNodes, level + 1, maxLevel);
  }

  private static void printWhitespaces(final int count) {
    for (int i = 0; i < count; i++)
      System.out.print(" ");
  }

  private static <T extends Comparable<T>> int maxLevel(final MyTreeNode<T> node) {
    if (node == null)
      return 0;

    return Math.max(PrintTreeData.maxLevel(node.getLeft()),
        PrintTreeData.maxLevel(node.getRight())) + 1;
  }

  private static <T> boolean isAllElementsNull(final List<T> list) {
    for (Object object : list) {
      if (object != null)
        return false;
    }

    return true;
  }

}
