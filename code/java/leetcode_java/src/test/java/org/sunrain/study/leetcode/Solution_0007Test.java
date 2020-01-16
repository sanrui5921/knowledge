package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution_0007Test {

    Solution_0007 solution_0007;

    @Before
    public void init() {
        solution_0007 = new Solution_0007();
    }

    @Test
    public void reverseTest1() {
        int value = 123;
        Assert.assertEquals(321, solution_0007.reverse(value));
    }

    @Test
    public void reverseTest2() {
        int value = -123;
        Assert.assertEquals(-321, solution_0007.reverse(value));
    }

    @Test
    public void reverseTest3() {
        int value = 120;
        Assert.assertEquals(21, solution_0007.reverse(value));
    }

    @Test
    public void reverseTest4() {
        int value = 120;
        Assert.assertEquals(21, solution_0007.reverse(value));
    }

    @Test
    public void reverseTest5() {
        int value = -2147483412;
        Assert.assertEquals(0, solution_0007.reverse(value));
    }
}
