package xyz.lfans.leetcode.top.interview.questions.easy.array;

import jdk.nashorn.internal.ir.Flags;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author MelancholyCat
 * @date Created in 10:08 2019-09-18
 * @description 只出现一次的数字
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * 说明：
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 */

public class A25 {
    public int singleNumber(int[] nums) {
        /*if (nums==null||nums.length<2)
            return nums[0];
        Arrays.sort(nums);
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            if (i==nums.length-1){
                if (flag == false)
                    return nums[i];
            }else if (flag == false && nums[i] != nums[i + 1]) {
                return nums[i];
            } else if (flag == true && nums[i] != nums[i + 1]) {
                flag = false;
        }else
                flag = true;
        }
        return nums[0];*/

        int num=0;
        for (int i =0;i<nums.length;i++)
            num^=nums[i];
        return num;

    }
}
