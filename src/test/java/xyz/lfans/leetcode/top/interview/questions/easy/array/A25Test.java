package xyz.lfans.leetcode.top.interview.questions.easy.array;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author MelancholyCat
 * @date Created in 10:23 2019-09-18
 * @description
 */

public class A25Test {

    @Test
    public void singleNumber() {
        A25 a25 = new A25();

        int[] arr = new int[]{2,2,1};
//        int[] arr = new int[]{4,1,2,1,2};

        int number = a25.singleNumber(arr);

        System.out.println(number);
    }
}