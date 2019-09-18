package xyz.lfans.leetcode.array;

import org.junit.Test;

/**
 * @author MelancholyCat
 * @date Created in 16:08 2019-09-17
 * @description
 */
public class Array26Test {

    Array26 array26 = new Array26();

    @Test
    public void removeDuplicates() {
//        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] nums = new int[]{5};
//        int[] nums = new int[]{1,1,2};

        // nums 是以“引用”方式传递的。也就是说，不对实参做任何拷贝
        int len = array26.removeDuplicates(nums);

// 在函数里修改输入数组对于调用者是可见的。
// 根据你的函数返回的长度, 它会打印出数组中该长度范围内的所有元素。
        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }
    }

    /**
     * 执行用时1ms的范例
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        int t = 1;
        if(nums.length==1){
            return 1;
        }
        if(nums.length==0){
            return 0;
        }
        for(int i = 1; i < nums.length; i++){
            if(nums[i]!=nums[i-1]){

                nums[t++] = nums[i];
            }
        }
        return t;
    }

}