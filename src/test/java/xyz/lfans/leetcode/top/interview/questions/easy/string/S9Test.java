package xyz.lfans.leetcode.top.interview.questions.easy.string;

import org.junit.Test;
import xyz.lfans.tools.StringTools;

import static org.junit.Assert.*;

/**
 * @author MelancholyCat
 * @date Created in 21:01 2019-09-28
 * @description MelancholyCat's Code
 */

public class S9Test {

    @Test
    public void longestCommonPrefix() {
        S9 s9 = new S9();
        String[] strings = StringTools.onlySmallChar(10);
        String string = s9.longestCommonPrefix(strings);
        System.out.println("comPre:"+string);
    }
}