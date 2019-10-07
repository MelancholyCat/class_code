package xyz.lfans.leetcode.top.interview.questions.easy.linkList;

import org.junit.Test;
import xyz.lfans.leetcode.top.interview.questions.easy.linkList.notes.ListNode;
import xyz.lfans.tools.LinkListTools;

import static org.junit.Assert.*;

/**
 * @author MelancholyCat
 * @date Created in 16:02 2019-10-03
 * @description MelancholyCat's Code
 */

public class L3Test {

    @Test
    public void reverseList() {
        int[] a = new int[]{1,2,3,4,5};
        ListNode head = LinkListTools.newLinkList(a);
        L3 l3 = new L3();
        ListNode node = l3.reverseList(head);
        while (node!=null){
            System.out.println(node.val);
            node = node.next;
        }
    }
}