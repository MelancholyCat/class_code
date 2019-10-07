package xyz.lfans.leetcode.top.interview.questions.easy.linkList;

import xyz.lfans.leetcode.top.interview.questions.easy.linkList.notes.ListNode;

import java.util.Stack;

/**
 * @author MelancholyCat
 * @date Created in 15:28 2019-10-03
 * @description 反转链表(迭代)
 * 反转一个单链表。
 */

public class L3 {
    public ListNode reverseList(ListNode head) {
//        标记当前结点next指针将要指向的结点
        ListNode prev = null;
//        标记当前结点
        ListNode curr = head;
        while (curr != null) {
//            标记当前结点next指针指向的结点
            ListNode nextTemp = curr.next;
//            替换当前结点next指针指向的结点
            curr.next = prev;
//            替换为下一结点next指针将要指向的结点
            prev = curr;
//            替换为当前结点的下一结点
            curr = nextTemp;
        }
        return prev;
    }
}
