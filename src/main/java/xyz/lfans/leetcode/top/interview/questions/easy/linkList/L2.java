package xyz.lfans.leetcode.top.interview.questions.easy.linkList;

import xyz.lfans.leetcode.top.interview.questions.easy.linkList.notes.ListNode;

/**
 * @author MelancholyCat
 * @date Created in 10:51 2019-09-30
 * @description 删除链表的倒数第N个节点
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 * 说明：
 * 给定的 n 保证是有效的。
 * 进阶：
 * 你能尝试使用一趟扫描实现吗？
 */

public class L2 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = head;
        int length = 0;
        while (node != null) {
            node = node.next;
            length++;
        }
        int index = length - n+1;
        node = head;
        if (index == 1) {
            head = head.next;
            return head;
        } else {
            while (index-- > 2) {
                node = node.next;
            }
            node.next = node.next.next;
        }
        return head;
    }
}
