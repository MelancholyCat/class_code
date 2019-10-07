package xyz.lfans.leetcode.top.interview.questions.easy.string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author MelancholyCat
 * @date Created in 09:48 2019-09-23
 * @description
 */

public class S5Test {

    @Test
    public void isPalindrome() {
        S5 s5 = new S5();
//        String s = "A man, a plan, a canal: Panama";
//        String s = "race a car";
        String s = "0P";
        boolean palindrome = s5.isPalindrome(s);
        Assert.assertTrue(palindrome);
    }
}