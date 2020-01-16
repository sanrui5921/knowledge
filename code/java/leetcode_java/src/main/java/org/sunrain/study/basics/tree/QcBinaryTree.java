package org.sunrain.study.basics.tree;

public class QcBinaryTree implements Tree {

    private Node root;

    @Override
    public Node find(int key) {
        return null;
    }

    @Override
    public boolean insert(int key) {
        if (root == null) {
            root = new Node();
            root.data = key;
            return true;
        }

        Node temp = root;

        while (temp != null) {
            if (temp.data > key) {
                if (temp.leftChild == null) {
                    temp.leftChild = new Node();
                    temp.leftChild.data = key;
                    return true;
                }
                temp = temp.leftChild;
            } else {
                if (temp.rightChild == null) {
                    temp.rightChild = new Node();
                    temp.rightChild.data = key;
                    return true;
                }
                temp = temp.rightChild;
            }
        }

        return false;
    }

    //中序遍历:左子树——》根节点——》右子树
    private void infixOrderInner(Node current) {
        if (current != null) {
            infixOrderInner(current.leftChild);
            System.out.print(current.data + " ");
            infixOrderInner(current.rightChild);
        }
    }

    public void infixOrder() {
        infixOrderInner(this.root);
        System.out.println();
    }

    public void preOrder() {
        preOrderInner(this.root);
        System.out.println();
    }

    //前序遍历:根节点——》左子树——》右子树
    private void preOrderInner(Node current) {
        if (current != null) {
            System.out.print(current.data + " ");
            preOrderInner(current.leftChild);
            preOrderInner(current.rightChild);
        }
    }

    public void postOrder() {
        postOrderInner(this.root);
        System.out.println();
    }

    //后序遍历:左子树——》右子树——》根节点
    private void postOrderInner(Node current) {
        if (current != null) {
            postOrderInner(current.leftChild);
            postOrderInner(current.rightChild);
            System.out.print(current.data + " ");
        }
    }

    @Override
    public boolean delete(int key) {
        return false;
    }

    @Override
    public Node findMax() {
        Node temp = root;
        while (temp != null) {
            if (temp.rightChild == null) {
                return temp;
            }
            temp = temp.rightChild;
        }
        return temp;
    }

    @Override
    public Node findMin() {
        Node temp = root;
        while (temp != null) {
            if (temp.leftChild == null) {
                return temp;
            }
            temp = temp.leftChild;
        }
        return temp;
    }

    @Override
    public int heigh() {
        return height(root);
    }

    @Override
    public int size() {
        return size(root);
    }

    @Override
    public Node getParent(int key) {
        return null;
    }

    public int size(Node node) {
        if (node == null) {
            return 0;
        }
        int l = size(node.leftChild);
        int r = size(node.rightChild);
        return l + r + 1;
    }

    public int height(Node node) {
        if (node == null) {
            return 0;
        }

        int l = height(node.leftChild);
        int r = height(node.rightChild);
        return l > r ? (l + 1) : (r + 1);
    }

    public static void main(String[] args) {
        QcBinaryTree tree = new QcBinaryTree();
        tree.insert(8);
        tree.insert(10);
        tree.insert(5);
        tree.insert(7);
        tree.insert(6);
        tree.infixOrder();
        tree.preOrder();
        tree.postOrder();
        Node node = tree.findMax();
        System.out.println(node.data);
        Node node1 = tree.findMin();
        System.out.println(node1.data);
        System.out.println("Tree's height:" + tree.heigh());
        System.out.println("Tree's size:" + tree.size());
    }
}
