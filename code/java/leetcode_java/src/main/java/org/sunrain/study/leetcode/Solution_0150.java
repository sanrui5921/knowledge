package org.sunrain.study.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 根据逆波兰表示法，求表达式的值。
 * <p>
 * 有效的运算符包括 +, -, *, / 。每个运算对象可以是整数，也可以是另一个逆波兰表达式。
 * <p>
 * 说明：
 * <p>
 * 整数除法只保留整数部分。
 * 给定逆波兰表达式总是有效的。换句话说，表达式总会得出有效数值且不存在除数为 0 的情况。
 * 示例 1：
 * <p>
 * 输入: ["2", "1", "+", "3", "*"]
 * 输出: 9
 * 解释: ((2 + 1) * 3) = 9
 * 示例 2：
 * <p>
 * 输入: ["4", "13", "5", "/", "+"]
 * 输出: 6
 * 解释: (4 + (13 / 5)) = 6
 * 示例 3：
 * <p>
 * 输入: ["10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"]
 * 输出: 22
 * 解释:
 * ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
 * = ((10 * (6 / (12 * -11))) + 17) + 5
 * = ((10 * (6 / -132)) + 17) + 5
 * = ((10 * 0) + 17) + 5
 * = (0 + 17) + 5
 * = 17 + 5
 * = 22
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/evaluate-reverse-polish-notation
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution_0150 {

    public int evalRPN(String[] tokens) {

        if (tokens == null || tokens.length == 0) {
            return 0;
        }

        Map<String, Calculator> map = new HashMap<>();

        map.put("+", new Add());
        map.put("-", new Subtract());
        map.put("*", new Multiply());
        map.put("/", new Divide());

        Stack<Integer> numberStack = new Stack();

        Stack<String> markStack = new Stack();

        for (String str : tokens) {
            if (map.get(str) != null) {
                markStack.push(str);
            } else {
                numberStack.push(Integer.parseInt(str));
            }
        }

        while (!numberStack.isEmpty() && !markStack.isEmpty()) {
            int result = map.get(markStack.pop()).calculate(numberStack.pop(), numberStack.pop());
            numberStack.push(result);
        }

        return numberStack.peek();
    }
}

interface Calculator {
    public int calculate(int first, int second);
}

class Add implements Calculator {
    @Override
    public int calculate(int first, int second) {
        return first + second;
    }
}

class Subtract implements Calculator {
    @Override
    public int calculate(int first, int second) {
        return first - second;
    }
}

class Multiply implements Calculator {
    @Override
    public int calculate(int first, int second) {
        return first * second;
    }
}

class Divide implements Calculator {
    @Override
    public int calculate(int first, int second) {
        return first / second;
    }
}