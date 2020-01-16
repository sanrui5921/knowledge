package org.sunrain.study.leetcode;

/**
 * 设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。
 * <p>
 * push(x) -- 将元素 x 推入栈中。
 * pop() -- 删除栈顶的元素。
 * top() -- 获取栈顶元素。
 * getMin() -- 检索栈中的最小元素。
 * 示例:
 * <p>
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> 返回 -3.
 * minStack.pop();
 * minStack.top();      --> 返回 0.
 * minStack.getMin();   --> 返回 -2.
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/min-stack
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

public class Solution_0155 {

    Stack stack;

    List<Integer> list;

    /**
     * initialize your data structure here.
     */
    public Solution_0155() {
        stack = new Stack();
        list = new ArrayList<>();
    }

    public void push(int x) {
        stack.push(x);
        if (list.size() == 0) {
            list.add(x);
        } else {
            if (x < list.get(list.size() - 1)) {
                list.add(x);
            } else {
                list.add(list.get(list.size() - 1));
            }
        }
    }

    public void pop() {
        stack.pop();
        list.remove(list.size() - 1);
    }

    public int top() {
        return (int) stack.peek();
    }

    public int getMin() {
        return list.get(list.size() - 1);
    }
}
