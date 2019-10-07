package xyz.lfans.leetcode.top.interview.questions.easy.string;

/**
 * @author MelancholyCat
 * @date Created in 11:44 2019-09-22
 * @description 验证回文字符串
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 */

public class S5 {
    public boolean isPalindrome(String s) {
        int i =0,j=s.length()-1;
        boolean flag = true;
        while (i<j){
            if (s.charAt(i)<48|(s.charAt(i)>57&&s.charAt(i)<65)|(s.charAt(i)>90&&s.charAt(i)<97)|s.charAt(i)>123){
                i++;
            }else if ((s.charAt(j)<48|(s.charAt(j)>57&&s.charAt(j)<65)|(s.charAt(j)>90&&s.charAt(j)<97)|s.charAt(j)>123)){
                j--;
            }else if (s.charAt(i)>47&&s.charAt(i)<58){
                if (s.charAt(i)==s.charAt(j)){
                    i++;j--;
                    flag=true;
                }else {
                    flag=false;
                    break;
                }
            }else if (s.charAt(i)==s.charAt(j)|s.charAt(i)==s.charAt(j)+32|s.charAt(i)==s.charAt(j)-32){
                i++;j--;
                flag=true;
            }else {
                flag=false;
                break;
            }
        }
        return flag;
    }
}
