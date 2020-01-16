package org.sunrain.study.basics.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BubbleSortTest {

    BubbleSort bubbleSort;

    @Before
    public void init() {
        bubbleSort = new BubbleSort();
    }

    @Test
    public void sortTest1() {

        int[] array = {1, 4, 2, 29, 23, 8, 21};

        int[] array1 = bubbleSort.sort(array);

        Assert.assertEquals(array1[0], 1);

        Assert.assertEquals(array1[1], 2);

        Assert.assertEquals(array1[2], 4);

        Assert.assertEquals(array1[3], 8);

        Assert.assertEquals(array1[4], 21);

        Assert.assertEquals(array1[5], 23);

        Assert.assertEquals(array1[6], 29);
    }
}
