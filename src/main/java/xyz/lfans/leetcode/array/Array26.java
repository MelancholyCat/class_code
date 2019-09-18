package xyz.lfans.leetcode.array;

/**
 * @author MelancholyCat
 * @date Created in 16:04 2019-09-17
 * @description 在排序数组中删除重复项
 * 时间复杂度:O(N) 空间复杂度:O(1)
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 */
public class Array26 {
    public static int removeDuplicates(int[] nums) {
        if(nums==null||nums.length<2){
            return nums.length;
        }
        int a = nums[0];
        int length = nums.length;
        for(int i=1;i<nums.length;i++){
            if (i<length){
                if(a==nums[i]){
                    for(int j = i;j<nums.length-1;j++){
                        nums[j] = nums[j+1];
                    }
                    i--;
                    length--;
                }else{
                    a=nums[i];
                }
            }else
                break;
        }
        return length;
    }
}
