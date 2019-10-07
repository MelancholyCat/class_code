package xyz.lfans.leetcode.top.interview.questions.easy.string;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author MelancholyCat
 * @date Created in 20:37 2019-09-25
 * @description MelancholyCat's Code
 */

public class S8Test {

    @Test
    public void countAndSay() {
        S8 s8 = new S8();
        for (int i = 1; i < 31; i++) {
            String string = s8.countAndSay(i);
            System.out.println(string);
        }
    }
}