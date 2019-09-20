package xyz.lfans.leetcode.top.interview.questions.easy.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author MelancholyCat
 * @date Created in 22:28 2019-09-17
 * @description 存在重复
 * 给定一个整数数组，判断是否存在重复元素。
 * 如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
 */
public class A24 {

    public boolean containsDuplicate(int[] nums) {
        if (nums==null||nums.length<2)
            return false;
        Arrays.sort(nums);
        for (int i = 0;i<nums.length-1;i++){
            if (nums[i]==nums[i+1])
                return true;
        }
        return false;
    }

    /*public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap();
        for (int i =0;i<nums.length;i++){
            if (map.get(nums[i])==null){
                map.put(nums[i],nums[i]);
            }else return true;
        }
        return false;
    }*/
}
