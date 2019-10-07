package xyz.lfans.leetcode.top.interview.questions.easy.string;

/**
 * @author MelancholyCat
 * @date Created in 20:07 2019-09-28
 * @description 最长公共前缀
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 */

public class S9 {
    public String longestCommonPrefix(String[] strs) {
//        如果字符串数组为空，直接返回空字符串
        if (strs == null || strs.length == 0)
            return "";
//        comPre用于存储公共前缀，初始化为字符串数组的第一个元素
        String comPre = strs[0];
//        逐一比较数组中的每一个元素
        for (int i = 1; i < strs.length; i++) {
//            当前比较的字符的下标
            int j = 0;
//            只需要比较公共前缀与当前元素中较短的长度的字符
            int num = comPre.length() > strs[i].length() ? strs[i].length() : comPre.length();
            while (j < num && comPre.charAt(j) == strs[i].charAt(j)) {
//            逐一比较公共前缀与当前元素的前j个字符，相等则检查下一个字符，否则退出循环
                j++;
            }
//            如果第一个字符就被退出循环，说明没有公共前缀
            if (j == 0) {
                return "";
            } else{
//                否则公共前缀为下标0到j-1的字符串
                comPre = comPre.substring(0, j);
            }
        }
        return comPre;
    }
}
