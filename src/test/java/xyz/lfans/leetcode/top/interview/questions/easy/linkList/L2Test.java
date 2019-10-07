package xyz.lfans.leetcode.top.interview.questions.easy.linkList;

import org.junit.Test;
import xyz.lfans.leetcode.top.interview.questions.easy.linkList.notes.ListNode;

import static org.junit.Assert.*;

/**
 * @author MelancholyCat
 * @date Created in 11:07 2019-09-30
 * @description MelancholyCat's Code
 */

public class L2Test {

    @Test
    public void removeNthFromEnd() {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        head.next=node2;
        node2.next=null;
//        ListNode node3 = new ListNode(3);
//        node2.next=node3;
//        ListNode node4 = new ListNode(4);
//        node3.next=node4;
//        ListNode node5 = new ListNode(5);
//        node4.next=node5;
        L2 l2 = new L2();
        ListNode node = l2.removeNthFromEnd(head,2);
        while (node!=null){
            System.out.println(node.val);
            node = node.next;
        }
    }
}