package xyz.lfans.leetcode.top.interview.questions.easy.array;

/**
 * @author MelancholyCat
 * @date Created in 18:58 2019-09-18
 * @description 移动零
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 */

public class A28 {
    public void moveZeroes(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                count++;
            else if (nums[i] != 0)
                nums[i - count] = nums[i];
        }
        for (int i = nums.length - count; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
