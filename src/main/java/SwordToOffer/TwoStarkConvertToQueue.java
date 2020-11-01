package SwordToOffer;

import java.util.Stack;

/**
 * @author ：Tong
 * @date ：Created in 2020/4/7 12:50
 * @description：
 * @version: $
 */
public class TwoStarkConvertToQueue {
    Stack<Integer> inStack = new Stack<>();
    Stack<Integer> outStack = new Stack<>();

    public TwoStarkConvertToQueue() {

    }

    public void appendTail(int value) {
        inStack.push(value);

    }

    public int deleteHead() {
        if (!outStack.isEmpty()) {
            return outStack.pop();
        } else {//出队列为空
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
            if (outStack.isEmpty()) {
                return -1;
            }
        }
        return outStack.pop();
    }
}
