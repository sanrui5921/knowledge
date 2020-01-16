package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Solution_0091Test {

    Solution_0091 solution;

    @Before
    public void init() {
        solution = new Solution_0091();
    }

    @Test
    public void numDecodingsTest1() {
        String str = "12";
        Assert.assertEquals(2, solution.numDecodings(str));
    }

    @Test
    public void numDecodingsTest2() {
        String str = "226";
        Assert.assertEquals(3, solution.numDecodings(str));
    }

    @Test
    public void numDecodingsTest3() {
        String str = "10";
        Assert.assertEquals(1, solution.numDecodings(str));
    }

    @Test
    public void numDecodingsTest4() {
        String str = "27";
        Assert.assertEquals(1, solution.numDecodings(str));
    }

    @Test
    public void numDecodingsTest5() {
        String str = "99";
        Assert.assertEquals(1, solution.numDecodings(str));
    }

    @Test
    public void numDecodingsTest6() {
        String str = "01";
        Assert.assertEquals(0, solution.numDecodings(str));
    }

    @Test
    public void numDecodingsTest7() {
        String str = "101";
        Assert.assertEquals(1, solution.numDecodings(str));
    }

    @Test
    public void numDecodingsTest8() {
        String str = "0";
        Assert.assertEquals(0, solution.numDecodings(str));
    }

    @Test
    public void numDecodingsTest9() {
        String str = "110";
        Assert.assertEquals(1, solution.numDecodings(str));
    }

    @Test
    public void numDecodingsTest10() {
        String str = "1212";
        Assert.assertEquals(1, solution.numDecodings(str));
    }
}
