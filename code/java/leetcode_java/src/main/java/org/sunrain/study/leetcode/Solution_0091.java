package org.sunrain.study.leetcode;

/**
 * 一条包含字母 A-Z 的消息通过以下方式进行了编码：
 * <p>
 * 'A' -> 1
 * 'B' -> 2
 * ...
 * 'Z' -> 26
 * 给定一个只包含数字的非空字符串，请计算解码方法的总数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "12"
 * 输出: 2
 * 解释: 它可以解码为 "AB"（1 2）或者 "L"（12）。
 * 示例 2:
 * <p>
 * 输入: "226"
 * 输出: 3
 * 解释: 它可以解码为 "BZ" (2 26), "VF" (22 6), 或者 "BBF" (2 2 6) 。
 * 在真实的面试中遇到过这道题？
 * <p>
 * 是
 * <p>
 * 否
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/decode-ways
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution_0091 {

    public int numDecodings(String s) {

        if (s == null) {
            return 0;
        }

        int length = s.length();

        int[] array = new int[length];

        char[] chars = s.toCharArray();

        for (int i = 0; i < length; i++) {

            int charI = Integer.parseInt(String.valueOf(chars[i]));

            int charI_1 = i - 1 < 0 ? -1 : Integer.parseInt(String.valueOf(chars[i - 1]));

            int arrayI_1 = i - 1 < 0 ? 1 : array[i - 1];

            int arrayI_2 = i - 2 < 0 ? 1 : array[i - 2];

            if ((charI == 0 && (charI_1 <= 0 || charI_1 > 2))) {
                return 0;
            }

            if (charI_1 == -1) {
                array[i] = 1;
                continue;
            }

            if ((charI_1 == 0 && charI > 0) || (charI_1 == 2 && charI > 6) || (charI_1 > 2 && charI > 0)) {
                array[i] = arrayI_1;
                continue;
            }

            if (charI == 0 && (charI_1 == 1 || charI_1 == 2)) {
                array[i] = arrayI_2;
                continue;
            }

            array[i] = arrayI_1 + 1;

        }
        return array[s.length() - 1];
    }
}
