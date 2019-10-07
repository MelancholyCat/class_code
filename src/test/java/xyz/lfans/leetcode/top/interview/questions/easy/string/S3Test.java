package xyz.lfans.leetcode.top.interview.questions.easy.string;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author MelancholyCat
 * @date Created in 20:17 2019-09-21
 * @description
 */

public class S3Test {

    @Test
    public void firstUniqChar() {
        S3 s3 = new S3();
//        String s = "loveleetcode";
//        String s = null;
//        String s = "a";
//        String s = "";
        String s = "cc";
        int i = s3.firstUniqChar(s);
        System.out.println(i);
    }
}