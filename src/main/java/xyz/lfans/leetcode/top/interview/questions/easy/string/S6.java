package xyz.lfans.leetcode.top.interview.questions.easy.string;

import jdk.nashorn.internal.ir.Flags;

/**
 * @author MelancholyCat
 * @date Created in 10:34 2019-09-23
 * @description 字符串转换整数 (atoi)
 * 请你来实现一个 atoi 函数，使其能将字符串转换成整数。
 * <p>
 * 首先，该函数会根据需要丢弃无用的开头空格字符，直到寻找到第一个非空格的字符为止。
 * 当我们寻找到的第一个非空字符为正或者负号时，则将该符号与之后面尽可能多的连续数字组合起来，作为该整数的正负号；
 * 假如第一个非空字符是数字，则直接将其与之后连续的数字字符组合起来，形成整数。
 * 该字符串除了有效的整数部分之后也可能会存在多余的字符，这些字符可以被忽略，它们对于函数不应该造成影响。
 * <p>
 * 注意：假如该字符串中的第一个非空格字符不是一个有效整数字符、字符串为空或字符串仅包含空白字符时，则你的函数不需要进行转换。
 * 在任何情况下，若函数不能进行有效的转换时，请返回 0。
 * <p>
 * 说明：
 * 假设我们的环境只能存储 32 位大小的有符号整数，那么其数值范围为 [−231,  231 − 1]。
 * 如果数值超过这个范围，请返回  INT_MAX (231 − 1) 或 INT_MIN (−231) 。
 */

public class S6 {
    public int myAtoi(String str) {
        if (str == null || str.length() < 1)
            return 0;
        String s = "";
        int i = 0;
//        首先，该函数会根据需要丢弃无用的开头空格字符，直到寻找到第一个非空格的字符为止。
        while (i < str.length() && str.charAt(i) == ' ') {
            i++;
        }
//        当我们寻找到的第一个非空字符为正或者负号时，则将该符号与之后面尽可能多的连续数字组合起来，作为该整数的正负号；
//        假如第一个非空字符是数字，则直接将其与之后连续的数字字符组合起来，形成整数。
        if (i < str.length() && (str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) > 47 && str.charAt(i) < 58)) {
            s += str.charAt(i++);
            while (i < str.length() && str.charAt(i) > 47 && str.charAt(i) < 58) {
                s += str.charAt(i++);
            }
            if (s.charAt(0) == '-') {
                if (s.length() == 1)
                    return 0;
                try {
                    return Integer.valueOf(s);
                } catch (NumberFormatException e) {
                    return Integer.MIN_VALUE;
                }
            } else if (s.charAt(0) == '+') {
                if (s.length() == 1)
                    return 0;
                try {
                    return Integer.valueOf(s);
                } catch (NumberFormatException e) {
                    return Integer.MAX_VALUE;
                }
            }else{
                try {
                    return Integer.valueOf(s);
                } catch (NumberFormatException e) {
                    return Integer.MAX_VALUE;
                }
            }
        }else return 0;
    }
}
