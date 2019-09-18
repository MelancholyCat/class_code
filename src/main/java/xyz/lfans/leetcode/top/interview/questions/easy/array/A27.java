package xyz.lfans.leetcode.top.interview.questions.easy.array;

/**
 * @author MelancholyCat
 * @date Created in 16:23 2019-09-18
 * @description 加一
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 */

public class A27 {
    public int[] plusOne(int[] digits) {
        int l = digits.length-1;
        while (l>0&&digits[l]==9){
            digits[l--]=0;
        }
        if (l==0&&digits[l]==9){
            int[] num = new int[digits.length+1];
            digits[l]=0;
            for (int i =digits.length;i>0;i--){
                num[i] = digits[i-1];
            }
            num[0]=1;
            return num;
        }
        digits[l]+=1;
        return digits;
    }

//    别人的做法
    /*public int[] plusOne(int[] digits) {
        for( int i = digits.length- 1; i>=0; i-- ){
            digits[i]++;
            digits[i] %=10;
            if(digits[i]!=0)
                return digits;
        }
        digits = new int [digits.length+1];
        digits[0] = 1;
        return digits;
    }*/

}
