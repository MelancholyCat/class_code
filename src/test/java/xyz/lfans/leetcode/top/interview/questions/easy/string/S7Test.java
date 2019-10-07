package xyz.lfans.leetcode.top.interview.questions.easy.string;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author MelancholyCat
 * @date Created in 19:08 2019-09-25
 * @description MelancholyCat's Code
 */

public class S7Test {

    @Test
    public void strStr() {
        S7 s7 = new S7();
//        String haystack = "hello", needle = "ll";
//        String haystack = "aaaaa", needle = "bba";
//        String haystack = "aaaaa", needle = "";
//        String haystack = "aaaaa", needle = " ";
//        String haystack = "hello", needle = "eo";
        String haystack = "a", needle = "aa";
        int i = s7.strStr(haystack, needle);
        System.out.println(i);
    }
}