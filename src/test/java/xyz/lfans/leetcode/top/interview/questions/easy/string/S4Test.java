package xyz.lfans.leetcode.top.interview.questions.easy.string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author MelancholyCat
 * @date Created in 11:13 2019-09-22
 * @description
 */

public class S4Test {

    @Test
    public void isAnagram() {
        S4 s4 = new S4();
        String s="rat",t="car";
        boolean anagram = s4.isAnagram(s, t);
        Assert.assertFalse(anagram);
//        Assert.assertTrue(anagram);
    }
}