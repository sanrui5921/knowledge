package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * 难度: 中等
 * <p>
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * <p>
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * <p>
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * <p>
 * 示例：
 * <p>
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution_0002Test {

    Solution_0002 solution;

    @Before
    public void init() {
        solution = new Solution_0002();
    }

    // 324 + 456 = 807
    @Test
    public void addTwoNumbersTest1() {
        ListNode l1 = new ListNode(2);
        ListNode l11 = new ListNode(4);
        ListNode l111 = new ListNode(3);
        l1.next = l11;
        l11.next = l111;

        ListNode l2 = new ListNode(5);
        ListNode l21 = new ListNode(6);
        ListNode l211 = new ListNode(4);
        l2.next = l21;
        l21.next = l211;

        ListNode l3 = solution.addTwoNumbers(l1, l2);

        Assert.assertEquals(l3.val, 7);
        Assert.assertEquals(l3.next.val, 0);
        Assert.assertEquals(l3.next.next.val, 8);
    }

    //342 + 425 = 767
    @Test
    public void addTwoNumbersTest2() {
        ListNode l1 = new ListNode(2);
        ListNode l11 = new ListNode(4);
        ListNode l111 = new ListNode(3);
        l1.next = l11;
        l11.next = l111;

        ListNode l2 = new ListNode(5);
        ListNode l21 = new ListNode(2);
        ListNode l211 = new ListNode(4);
        l2.next = l21;
        l21.next = l211;

        ListNode l3 = solution.addTwoNumbers(l1, l2);

        Assert.assertEquals(l3.val, 7);
        Assert.assertEquals(l3.next.val, 6);
        Assert.assertEquals(l3.next.next.val, 7);
    }

    //24 + 425 = 449
    @Test
    public void addTwoNumbersTest3() {
        ListNode l1 = new ListNode(4);
        ListNode l11 = new ListNode(2);
        l1.next = l11;

        ListNode l2 = new ListNode(5);
        ListNode l21 = new ListNode(2);
        ListNode l211 = new ListNode(4);
        l2.next = l21;
        l21.next = l211;

        ListNode l3 = solution.addTwoNumbers(l1, l2);

        Assert.assertEquals(l3.val, 9);
        Assert.assertEquals(l3.next.val, 4);
        Assert.assertEquals(l3.next.next.val, 4);
    }

    //28 + 425 = 453
    @Test
    public void addTwoNumbersTest4() {
        ListNode l1 = new ListNode(8);
        ListNode l11 = new ListNode(2);
        l1.next = l11;

        ListNode l2 = new ListNode(5);
        ListNode l21 = new ListNode(2);
        ListNode l211 = new ListNode(4);
        l2.next = l21;
        l21.next = l211;

        ListNode l3 = solution.addTwoNumbers(l1, l2);

        Assert.assertEquals(l3.val, 3);
        Assert.assertEquals(l3.next.val, 5);
        Assert.assertEquals(l3.next.next.val, 4);
    }

    //425 + 28 = 453
    @Test
    public void addTwoNumbersTest5() {
        ListNode l1 = new ListNode(8);
        ListNode l11 = new ListNode(2);
        l1.next = l11;

        ListNode l2 = new ListNode(5);
        ListNode l21 = new ListNode(2);
        ListNode l211 = new ListNode(4);
        l2.next = l21;
        l21.next = l211;

        ListNode l3 = solution.addTwoNumbers(l2, l1);

        Assert.assertEquals(l3.val, 3);
        Assert.assertEquals(l3.next.val, 5);
        Assert.assertEquals(l3.next.next.val, 4);
    }

    //425 + 24 = 449
    @Test
    public void addTwoNumbersTest6() {
        ListNode l1 = new ListNode(4);
        ListNode l11 = new ListNode(2);
        l1.next = l11;

        ListNode l2 = new ListNode(5);
        ListNode l21 = new ListNode(2);
        ListNode l211 = new ListNode(4);
        l2.next = l21;
        l21.next = l211;

        ListNode l3 = solution.addTwoNumbers(l2, l1);

        Assert.assertEquals(l3.val, 9);
        Assert.assertEquals(l3.next.val, 4);
        Assert.assertEquals(l3.next.next.val, 4);
    }


    //2 + 425 = 427
    @Test
    public void addTwoNumbersTest7() {

        ListNode l1 = new ListNode(2);

        ListNode l2 = new ListNode(5);
        ListNode l21 = new ListNode(2);
        ListNode l211 = new ListNode(4);
        l2.next = l21;
        l21.next = l211;

        ListNode l3 = solution.addTwoNumbers(l1, l2);

        Assert.assertEquals(l3.val, 7);
        Assert.assertEquals(l3.next.val, 2);
        Assert.assertEquals(l3.next.next.val, 4);
    }

    //5 + 425 = 430
    @Test
    public void addTwoNumbersTest8() {

        ListNode l1 = new ListNode(5);

        ListNode l2 = new ListNode(5);
        ListNode l21 = new ListNode(2);
        ListNode l211 = new ListNode(4);
        l2.next = l21;
        l21.next = l211;

        ListNode l3 = solution.addTwoNumbers(l1, l2);

        Assert.assertEquals(l3.val, 0);
        Assert.assertEquals(l3.next.val, 3);
        Assert.assertEquals(l3.next.next.val, 4);
    }

    //425 + 5  = 430
    @Test
    public void addTwoNumbersTest9() {

        ListNode l1 = new ListNode(5);

        ListNode l2 = new ListNode(5);
        ListNode l21 = new ListNode(2);
        ListNode l211 = new ListNode(4);
        l2.next = l21;
        l21.next = l211;

        ListNode l3 = solution.addTwoNumbers(l2, l1);

        Assert.assertEquals(l3.val, 0);
        Assert.assertEquals(l3.next.val, 3);
        Assert.assertEquals(l3.next.next.val, 4);
    }

    //0 + 0  = 430
    @Test
    public void addTwoNumbersTest10() {

        ListNode l1 = new ListNode(0);

        ListNode l2 = new ListNode(0);

        ListNode l3 = solution.addTwoNumbers(l2, l1);

        Assert.assertEquals(l3.val, 0);
        Assert.assertEquals(l3.next, null);
    }

    //0 + 5  = 430
    @Test
    public void addTwoNumbersTest11() {

        ListNode l1 = new ListNode(0);

        ListNode l2 = new ListNode(5);

        ListNode l3 = solution.addTwoNumbers(l2, l1);

        Assert.assertEquals(l3.val, 5);

        Assert.assertEquals(l3.next, null);
    }

    //5 + 5  = 10
    @Test
    public void addTwoNumbersTest12() {

        ListNode l1 = new ListNode(5);

        ListNode l2 = new ListNode(5);

        ListNode l3 = solution.addTwoNumbers(l2, l1);

        Assert.assertEquals(l3.val, 0);

        Assert.assertEquals(l3.next.val, 1);

        Assert.assertEquals(l3.next.next, null);
    }

    //95 + 5  = 100
    @Test
    public void addTwoNumbersTest13() {

        ListNode l1 = new ListNode(5);
        ListNode l11 = new ListNode(9);
        l1.next = l11;

        ListNode l2 = new ListNode(5);

        ListNode l3 = solution.addTwoNumbers(l1, l2);

        Assert.assertEquals(l3.val, 0);

        Assert.assertEquals(l3.next.val, 0);

        Assert.assertEquals(l3.next.next.val, 1);

        Assert.assertEquals(l3.next.next.next, null);
    }
}
