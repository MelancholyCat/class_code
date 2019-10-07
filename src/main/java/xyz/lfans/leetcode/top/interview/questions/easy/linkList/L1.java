package xyz.lfans.leetcode.top.interview.questions.easy.linkList;

import xyz.lfans.leetcode.top.interview.questions.easy.linkList.notes.ListNode;

/**
 * @author MelancholyCat
 * @date Created in 10:26 2019-09-30
 * @description 删除链表中的节点
 * 现有一个链表 -- head = [4,5,1,9]
 * 说明:
 *      链表至少包含两个节点。
 *      链表中所有节点的值都是唯一的。
 *      给定的节点为非末尾节点并且一定是链表中的一个有效节点。
 *      不要从你的函数中返回任何结果。
 */

public class L1 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
