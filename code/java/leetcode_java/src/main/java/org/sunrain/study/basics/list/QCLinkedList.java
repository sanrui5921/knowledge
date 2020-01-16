package org.sunrain.study.basics.list;

public class QCLinkedList {

    private Node head;

    private Node current;

    public void add(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            current = node;
        } else {
            current.next = node;
            current = node;
        }
    }

    public void display() {
        Node temp = head;
        System.out.print("列表中数据如下:");
        while (temp != null) {
            System.out.print(" " + temp.value);
            temp = temp.next;
        }
    }
}

class Node {

    public Node(int value) {
        this.value = value;
    }

    public int value;

    public Node next;

}