package org.sunrain.study.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "()"
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: "()[]{}"
 * 输出: true
 * 示例 3:
 * <p>
 * 输入: "(]"
 * 输出: false
 * 示例 4:
 * <p>
 * 输入: "([)]"
 * 输出: false
 * 示例 5:
 * <p>
 * 输入: "{[]}"
 * 输出: true
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Solution_0020 {

    private Map<Character, Character> map = new HashMap<>();

    public Solution_0020() {
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
    }

    public boolean isValid(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }

        Stack stack1 = new Stack();
        char[] charArray = s.toCharArray();
        for (char ch : charArray) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack1.push(ch);
            } else {
                if (!stack1.isEmpty()) {
                    char ele = (char) stack1.pop();
                    if (map.get(ele) != ch) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }

        if (stack1.isEmpty()) {
            return true;
        }

        return false;
    }
}
