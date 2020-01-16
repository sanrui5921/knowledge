package org.sunrain.study.leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * <p>
 * 示例:
 * <p>
 * 给定 nums = [2, 7, 11, 15], target = 9
 * <p>
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Solution_0001Test {

    Solution_0001 solution_0001;

    @Before
    public void init() {
        solution_0001 = new Solution_0001();
    }

    @Test
    public void twoSumTest1() {

        int questions[] = new int[]{2, 7, 11, 15};

        int target = 9;

        int answers[] = solution_0001.twoSum(questions, target);

        Assert.assertEquals(answers[0], 0);

        Assert.assertEquals(answers[1], 1);
    }

    @Test
    public void twoSumTest2() {

        int questions[] = new int[]{2, 7, 11, 15, 9, 12};

        int target = 16;

        int answers[] = solution_0001.twoSum(questions, target);

        Assert.assertEquals(answers[0], 1);

        Assert.assertEquals(answers[1], 4);
    }

    @Test
    public void twoSumTest3() {

        int questions[] = new int[]{2, 7, 11, 15, 9, 12};

        int target = 21;

        int answers[] = solution_0001.twoSum(questions, target);

        Assert.assertEquals(answers[0], 4);

        Assert.assertEquals(answers[1], 5);
    }

    @Test
    public void twoSumTest4() {

        int questions[] = new int[]{2, 7, 11, 15, 9, 12};

        int target = 100;

        int answers[] = solution_0001.twoSum(questions, target);

        Assert.assertArrayEquals(answers, null);
    }

    @Test
    public void twoSumTest5() {

        int questions[] = new int[]{3, 2, 4};

        int target = 6;

        int answers[] = solution_0001.twoSum(questions, target);

        Assert.assertEquals(answers[0], 1);

        Assert.assertEquals(answers[1], 2);
    }
}
