package xyz.lfans.leetcode.top.interview.questions.easy.string;

/**
 * @author MelancholyCat
 * @date Created in 19:35 2019-09-25
 * @description 报数
 * 报数序列是一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。
 * <p>
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * <p>
 * 1 被读作  "one 1"  ("一个一") , 即 11。
 * 11 被读作 "two 1s" ("两个一"）, 即 21。
 * 21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。
 * <p>
 * 给定一个正整数 n（1 ≤ n ≤ 30），输出报数序列的第 n 项。
 * <p>
 * 注意：整数顺序将表示为一个字符串。
 */

public class S8 {
    public String countAndSay(int n) {
        if (n==1)
            return "1";
        String string = "1";
        String string2 = "";
        while (n-->1){
            string2 = "";
            char ch = string.charAt(0);
            int num = 0;
            for (int i = 0; i < string.length(); i++) {
                if (string.charAt(i)==ch){
                    num++;
                }else {
                    string2=string2+num+ch;
                    num=1;
                    ch = string.charAt(i);
                }
            }
            string2=string2+num+ch;
            string = string2;
        }
        return string2;
    }
}
