package xyz.lfans.swordFinger;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author MelancholyCat
 * @date Created in 20:55 2019-09-25
 * @description MelancholyCat's Code
 */

public class QueuesStackTest {

    @Test
    public void push() {
        QueuesStack queuesStack = new QueuesStack();
        queuesStack.push(1);
        queuesStack.push(2);
        System.out.println(queuesStack.top());
        System.out.println(queuesStack.pop());
        System.out.println(queuesStack.top());
        System.out.println(queuesStack.pop());
        System.out.println(queuesStack.empty());
    }

    @Test
    public void pop() {
    }
}