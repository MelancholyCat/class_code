package xyz.lfans.leetcode.array;

/**
 * @author MelancholyCat
 * @date Created in 16:47 2019-09-17
 * @description 时间复杂度:O(N) 空间复杂度:O(1)
 *  给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
 *  不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 *  元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 */
public class Array27 {
    public int removeElement(int[] nums, int val) {
        int newLength = nums.length;
        for (int i = 0;i<newLength;i++){
            if (nums[i]==val){
                swap(nums,i--,--newLength);
            }
        }
        return newLength;
    }

    public static void swap(int[] arr, int i, int j) {
        //异或操作交换两个元素的值
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
}
