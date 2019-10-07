package xyz.lfans.leetcode.top.interview.questions.easy.string;

import java.util.jar.JarEntry;

/**
 * @author MelancholyCat
 * @date Created in 11:08 2019-09-22
 * @description 有效的字母异位词
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 */

public class S4 {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length())
            return false;

        int[] ints = new int[27];
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < ints.length; j++) {
                if (s.charAt(i)==j+97)
                    ints[j]++;
            }
        }
        for (int i = 0; i < t.length(); i++) {
            for (int j = 0; j < ints.length; j++) {
                if (t.charAt(i)==j+97)
                    if (ints[j]==0)
                        return false;
                    else ints[j]--;
            }
        }
        for (int i = 0; i < ints.length; i++) {
            if (ints[i]!=0)
                return false;
        }
        return true;
    }
}
