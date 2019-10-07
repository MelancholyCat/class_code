package xyz.lfans.leetcode.top.interview.questions.easy.linkList;

import xyz.lfans.leetcode.top.interview.questions.easy.linkList.notes.ListNode;

/**
 * @author MelancholyCat
 * @date Created in 21:13 2019-10-06
 * @description 反转链表(递归)
 * 反转一个单链表。
 */

public class L3_dg {
    public ListNode reverseList(ListNode head) {
        //1、如果头节点为空或头节点的下一个结点为空，直接返回头节点，不用排序
        //2、如果当前节点的下一个结点为空，说明已经到了该单链表尾端，返回当前节点以待下一步处理
        if (head==null||head.next==null) return head;
        //遍历节点至当前节点的next指针指向null，并用p暂存该节点作为返回值
        ListNode p = reverseList(head.next);
        //令当前节点的下一个节点的next指针指向当前节点
        head.next.next = head;
        //断开当前节点的next指针，使其没有后续节点，否则这个链表会产生循环
        head.next = null;
        return p;
    }
}
