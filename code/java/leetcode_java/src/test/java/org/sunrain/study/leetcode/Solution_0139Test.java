package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Solution_0139Test {

    Solution_0139 solution;

    @Before
    public void init() {
        solution = new Solution_0139();
    }

    @Test
    public void wordBreakTest1() {
        String str = "leetcode";
        String[] wordsArray = {"leet", "code"};
        List<String> words = Arrays.asList(wordsArray);
        Assert.assertEquals(true, solution.wordBreak(str, words));
    }

    @Test
    public void wordBreakTest2() {
        String str = "applepenapple";
        String[] wordsArray = {"apple", "pen"};
        List<String> words = Arrays.asList(wordsArray);
        Assert.assertEquals(true, solution.wordBreak(str, words));
    }

    @Test
    public void wordBreakTest3() {
        String str = "catsandog";
        String[] wordsArray = {"cats", "dog", "sand", "and", "cat"};
        List<String> words = Arrays.asList(wordsArray);
        Assert.assertEquals(false, solution.wordBreak(str, words));
    }


    @Test
    public void wordBreakTest4() {
        String str = "cars";
        String[] wordsArray = {"car", "ca", "rs"};
        List<String> words = Arrays.asList(wordsArray);
        Assert.assertEquals(true, solution.wordBreak(str, words));
    }

    @Test
    public void wordBreakTest5() {
        String str = "ccbb";
        String[] wordsArray = {"bc", "cb"};
        List<String> words = Arrays.asList(wordsArray);
        Assert.assertEquals(false, solution.wordBreak(str, words));
    }
}
