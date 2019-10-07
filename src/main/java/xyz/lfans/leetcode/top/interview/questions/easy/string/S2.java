package xyz.lfans.leetcode.top.interview.questions.easy.string;

/**
 * @author MelancholyCat
 * @date Created in 19:26 2019-09-21
 * @description 整数反转
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 */

public class S2 {
    public int reverse(int x) {
        char[] chars = String.valueOf(x).toCharArray();
        String s = "";
        int i = 0,j=chars.length-1;
        if (chars[0]=='-')
            i=1;
        while (i<j){
            swap(chars,i++,j--);
        }
        for (int k = 0; k < chars.length; k++) {
            s+=chars[k];
        }
        try {
            Integer integer = Integer.valueOf(s);
            return integer;
        }catch (NumberFormatException n){
            return 0;
        }

    }

    public static void swap(char[] arr, int i, int j) {
        char ch = arr[i];
        arr[i] = arr[j];
        arr[j] = ch;
    }
}
