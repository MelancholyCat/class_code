package xyz.lfans.leetcode.top.interview.questions.easy.string;

import java.util.Arrays;

/**
 * @author MelancholyCat
 * @date Created in 19:46 2019-09-21
 * @description 字符串中的第一个唯一字符
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 */

public class S3 {

    /*自己做的*/
//    public int firstUniqChar(String s) {
//        if (s==null||s=="")
//            return -1;
//        else if (s.length()<1)
//            return -1;
//        else if (s.length()<2)
//            return 0;
//        else {
//            char[] chars = s.toCharArray();
//            for (int i = 0; i < s.length(); i++) {
//                for (int j = 0; j < s.length(); j++) {
//                    if (i==s.length()-1){
//                        if (j!=i){
//                            if (chars[i]==chars[j])
//                                break;
//                        }else return i;
//                    }
//                    if (j!=i){
//                        if (chars[i]==chars[j])
//                            break;
//                        if (j==s.length()-1)
//                            return i;
//                    }
//                }
//            }
//            return -1;
//        }
//    }


    public static int firstUniqChar(String s) {
        int index = -1;
        for (char i = 'a'; i <= 'z'; i++) {
            int front = s.indexOf(i);
            int post = s.lastIndexOf(i);
            if (front == post && front != -1) {
                if (index == -1)
                    index = front;
                else
                    index = (front < index) ? front : index;
            }

        }

        return index;
    }

}
