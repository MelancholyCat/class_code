package xyz.lfans.leetcode.top.interview.questions.easy.array;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author MelancholyCat
 * @date Created in 20:52 2019-09-17
 * @description
 */
public class A22Test {

    @Test
    public void maxProfit() {
        A22 a22 = new A22();
        int[] prices = new int[]{7,1,5,3,6,4};
//        int[] prices = new int[]{1,2,3,4,5};
//        int[] prices = new int[]{7,6,4,3,1};
        int i = a22.maxProfit(prices);
        System.out.println(i);
    }
}