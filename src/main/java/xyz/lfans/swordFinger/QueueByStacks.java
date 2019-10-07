package xyz.lfans.swordFinger;

import java.util.Stack;

/**
 * @author MelancholyCat
 * @date Created in 15:27 2019-09-24
 * @description 用两个栈实现队列
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */

public class QueueByStacks {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        if (this.stack2.isEmpty()){
            this.stack1.push(node);
        }else {
            while (!this.stack2.isEmpty()){
                this.stack1.push(this.stack2.pop());
            }
            this.stack1.push(node);
        }
    }

    public int pop() {
        if (this.stack1.isEmpty()&&this.stack2.isEmpty()){
            throw new RuntimeException("Queue is empty!");
        }else if (this.stack1.isEmpty()&&!this.stack2.isEmpty()){
            return this.stack2.pop();
        }else{
            while (!this.stack1.isEmpty()){
                this.stack2.push(this.stack1.pop());
            }
            return this.stack2.pop();
        }
    }
}
