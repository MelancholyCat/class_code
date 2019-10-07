package xyz.lfans.leetcode.top.interview.questions.easy.string;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author MelancholyCat
 * @date Created in 15:26 2019-09-21
 * @description
 */

public class S1Test {

    @Test
    public void reverseString() {
        S1 s1 = new S1();
//        char[] chars = {'h','e','l','l','o'};
        char[] chars = {};
//        char[] chars = {'h','e','l','l','o','H'};
//        char[] chars = {'h'};
        s1.reverseString(chars);
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
        System.out.println();
    }
}