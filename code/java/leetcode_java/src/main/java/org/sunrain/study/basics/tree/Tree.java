package org.sunrain.study.basics.tree;

public interface Tree {

    //查找节点
    public Node find(int key);

    //插入新节点
    public boolean insert(int key);

    //删除节点
    public boolean delete(int key);
    //Other Method......

    public Node findMax();

    public Node findMin();

    //获取二叉树的高度
    public int heigh();

    public int size();

    public Node getParent(int key);
}