package Hot100;

import java.util.PriorityQueue;
import java.util.Stack;

/**
 * @author ：Tong
 * @date ：Created in 2020/4/15 17:11
 * @description： 设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。
 *
 * push(x) —— 将元素 x 推入栈中。
 * pop() —— 删除栈顶的元素。
 * top() —— 获取栈顶元素。
 * getMin() —— 检索栈中的最小元素。
 * 示例:
 *
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> 返回 -3.
 * minStack.pop();
 * minStack.top();      --> 返回 0.
 * minStack.getMin();   --> 返回 -2.
 * @version: $
 */
public class Top_155MinStack {
    Stack<Integer> stack = new Stack<>();
    PriorityQueue<Integer> queue = new PriorityQueue<>();
    /** initialize your data structure here. */
    public Top_155MinStack() {

    }

    public void push(int x) {
        stack.push(x);
        queue.offer(x);
    }

    public void pop() {
        queue.remove(stack.pop());
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return queue.peek();
    }
}
