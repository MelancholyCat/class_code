package xyz.lfans.leetcode.top.interview.questions.easy.array;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author MelancholyCat
 * @date Created in 22:34 2019-09-17
 * @description
 */
public class A24Test {

    @Test
    public void containsDuplicate() {
        A24 a24 =new A24();
        int[] arrs= new int[]{1,2,3,1};
//        int[] arrs= new int[]{1,2,3,4};
//        int[] arrs= new int[]{1,1,1,3,3,4,3,2,4,2};
        boolean b = a24.containsDuplicate(arrs);
        System.out.println(b);
    }
}