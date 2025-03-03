package xyz.lfans.leetcode.top.interview.questions.easy.string;

/**
 * @author MelancholyCat
 * @date Created in 14:37 2019-09-25
 * @description 实现 strStr() 函数。
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 * 说明:
 * 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
 * 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。
 */

public class S7 {
    public int strStr(String haystack, String needle) {
//        当 needle 是空字符串时我们应当返回 0
        if (needle==null|| needle.length() < 1)
            return 0;
        int index = -1;
        for (int i = 0;i<haystack.length();i++){
            if (haystack.charAt(i)==needle.charAt(0)){
                if (i+needle.length()>haystack.length())
                    return -1;
                index = i;
                for (int j = 0;i+j<haystack.length()&&j<needle.length();j++){
                    if (haystack.charAt(i+j)!=needle.charAt(j)){
                        index=-1;
                        break;
                    }
                }if (index!=-1){
                    return index;
                }
            }
        }
        return index;
    }
}
