package xyz.lfans.tools;

import xyz.lfans.leetcode.top.interview.questions.easy.linkList.notes.ListNode;

/**
 * @author MelancholyCat
 * @date Created in 16:02 2019-10-03
 * @description LinkListTools
 */

public class LinkListTools {
    public static ListNode newLinkList(int[] nums){
        int len = nums.length;
        if (len>0){
            ListNode head = new ListNode(nums[0]);
            len--;
            ListNode pre = head;
            int i = 1;
            while (len>0){
                ListNode node = new ListNode(nums[i]);
                i++;
                pre.next = node;
                pre = pre.next;
                len--;
            }
            return head;
        }else
            return null;
    }
}
