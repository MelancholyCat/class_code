package xyz.lfans.swordFinger;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author MelancholyCat
 * @date Created in 20:16 2019-09-25
 * @description 用两个队列实现栈
 * 用两个队列来实现一个栈，完成栈的Push和Pop操作。 队列中的元素为int类型。
 *  https://leetcode-cn.com/problems/implement-stack-using-queues/submissions/
 */

public class QueuesStack {
    Queue<Integer> queue1;
    Queue<Integer> queue2;

    /** Initialize your data structure here. */
    public QueuesStack() {
        queue1 = new LinkedList<Integer>();
        queue2 = new LinkedList<Integer>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
//        进入存储数据的队列中
        queue1.add(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
//        如果栈是空的，则抛出空栈异常
        if (queue1.isEmpty()){
            throw new RuntimeException("Stack is empty!");
        }
//        将存储队列中除最后一个数以外的所有数均从存储队列中出队，进入辅助队列的队列中；
        while (queue1.size()!=1){
            queue2.add(queue1.poll());
        }
//        存储栈顶元素（最后进来的数）
        int i = queue1.poll();
//        放回存储队列中
        while (queue2.size()>0){
            queue1.add(queue2.poll());
        }
        return i;
    }

    /** Get the top element. */
    public int top() {
        if (queue1.isEmpty()){
            throw new RuntimeException("Stack is empty!");
        }
        while (queue1.size()!=1){
            queue2.add(queue1.poll());
        }
        int i = queue1.poll();
        queue2.add(i);
        while (queue2.size()>0){
            queue1.add(queue2.poll());
        }
        return i;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
//        由于每次操作完，数据都会存回存储数据的队列，所以只需要判断存储数据的队列是否为空便可
        return queue1.isEmpty();
    }

}
