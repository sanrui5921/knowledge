package org.sunrain.study.basics.stack;

import org.junit.Assert;
import org.junit.Test;

public class QCStackTest {

    @Test
    public void test() throws Exception {
        QCStack qcStack = new QCStack(10);
        qcStack.push(1);
        qcStack.push(2);
        qcStack.push(3);
        qcStack.push(4);
        Assert.assertEquals(qcStack.peek(), 4);
        Assert.assertEquals(qcStack.isFull(), false);
        qcStack.push(5);
        qcStack.push(6);
        qcStack.push(7);
        qcStack.push(8);
        qcStack.push(9);
        qcStack.push(10);
        Assert.assertEquals(qcStack.isFull(), true);
    }
}
