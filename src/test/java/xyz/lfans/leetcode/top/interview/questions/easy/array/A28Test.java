package xyz.lfans.leetcode.top.interview.questions.easy.array;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author MelancholyCat
 * @date Created in 19:01 2019-09-18
 * @description
 */

public class A28Test {

    @Test
    public void moveZeroes() {
        A28 a28 = new A28();
        int[] nums = new int[]{0,1,0,3,12};
        a28.moveZeroes(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]+" ");
        }
    }
}