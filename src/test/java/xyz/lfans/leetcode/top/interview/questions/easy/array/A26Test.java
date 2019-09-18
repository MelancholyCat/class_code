package xyz.lfans.leetcode.top.interview.questions.easy.array;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author MelancholyCat
 * @date Created in 15:14 2019-09-18
 * @description
 */

public class A26Test {

    @Test
    public void intersect() {
        A26 a26 = new A26();

//        int[] nums1 = new int[]{1,2,2,1}, nums2 =new int[]{2,2} ;
        int[] nums1 = new int[]{4,9,5}, nums2 =new int[]{9,4,9,8,4} ;

        int[] ints = a26.intersect(nums1, nums2);

        for (int i = 0;i<ints.length;i++){
            System.out.print(ints[i]+" ");
        }

    }
}