package org.sunrain.study.basics.list;

import org.junit.Test;

public class QCArrayListTest {

    @Test
    public void test() {

        QCLinkedList qcLinkedList = new QCLinkedList();

        qcLinkedList.add(1);

        qcLinkedList.add(2);

        qcLinkedList.add(3);

        qcLinkedList.display();
    }
}
