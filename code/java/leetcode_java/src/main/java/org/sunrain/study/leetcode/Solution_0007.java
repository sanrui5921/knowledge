package org.sunrain.study.leetcode;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 123
 * 输出: 321
 *  示例 2:
 * <p>
 * 输入: -123
 * 输出: -321
 * 示例 3:
 * <p>
 * 输入: 120
 * 输出: 21
 * 注意:
 * <p>
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-integer
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Solution_0007 {

    public int reverse(int x) {
        int ans = 0;
        while (x != 0) {
            int pop = x % 10;
            if (ans > 2147483646 / 10 || (ans == 2147483646 / 10 && pop > 7))
                return 0;
            if (ans < -2147483648 / 10 || (ans == -2147483648 / 10 && pop < -8))
                return 0;
            ans = ans * 10 + pop;
            x /= 10;
        }
        return ans;
    }


    public int max() {
        return (int) Math.pow(2, 31) - 1;
    }

    public int min() {
        return (int) -Math.pow(2, 31);
    }

//    public static void main(String[] args) {
//        System.out.println(new Solution_0007().max());
//        System.out.println(new Solution_0007().min());
//    }
}
