package xyz.lfans.leetcode.top.interview.questions.easy.array;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author MelancholyCat
 * @date Created in 16:45 2019-09-18
 * @description
 */

public class A27Test {

    @Test
    public void plusOne() {
        A27 a27 = new A27();
//        int[] num = new int[]{1,2,3};
//        int[] num = new int[]{4,3,2,1};
        int[] num = new int[]{9,9,9};
//        int[] num = new int[]{0,9,1};
        int[] ints = a27.plusOne(num);
        for (int i =0;i<ints.length;i++){
            System.out.print(ints[i]+" ");
        }
    }
}