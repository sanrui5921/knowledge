package org.sunrain.study.basics.tree;

public class Node {

    int data;    //节点数据

    Node leftChild; //左子节点的引用

    Node rightChild; //右子节点的引用

    //打印节点内容
    public void display() {
        System.out.println(data);
    }
}