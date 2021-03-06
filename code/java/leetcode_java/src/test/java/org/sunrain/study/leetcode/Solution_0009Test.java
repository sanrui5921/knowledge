package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 121
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * 示例 3:
 * <p>
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/palindrome-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Solution_0009Test {

    Solution_0009 solution;

    @Before
    public void init() {
        solution = new Solution_0009();
    }

    @Test
    public void isPalindromeTest1() {
        int number = 121;
        boolean result = solution.isPalindrome(number);
        Assert.assertEquals(result, true);
    }

    @Test
    public void isPalindromeTest2() {
        int number = -121;
        boolean result = solution.isPalindrome(number);
        Assert.assertEquals(result, false);
    }

    @Test
    public void isPalindromeTest3() {
        int number = 10;
        boolean result = solution.isPalindrome(number);
        Assert.assertEquals(result, false);
    }

    @Test
    public void isPalindromeTest4() {
        int number = 22;
        boolean result = solution.isPalindrome(number);
        Assert.assertEquals(result, true);
    }

    @Test
    public void isPalindromeTest5() {
        int number = 1221;
        boolean result = solution.isPalindrome(number);
        Assert.assertEquals(result, true);
    }
}
