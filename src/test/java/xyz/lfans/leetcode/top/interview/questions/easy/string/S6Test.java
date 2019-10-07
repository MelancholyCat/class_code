package xyz.lfans.leetcode.top.interview.questions.easy.string;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author MelancholyCat
 * @date Created in 08:41 2019-09-24
 * @description
 */

public class S6Test {

    @Test
    public void myAtoi() {
        S6 s6 = new S6();
//        String string = "42";
//        String string = "words and 987";
//        String string = "-91283472332";
//        String string = "2147483648";
//        String string = "";
//        String string = " ";
//        String string = "+fsdc";
        String string = "-";
//        String string = "4193 with words";
//        String string = "     -42";
        int i = s6.myAtoi(string);
        System.out.println(i);
    }
}