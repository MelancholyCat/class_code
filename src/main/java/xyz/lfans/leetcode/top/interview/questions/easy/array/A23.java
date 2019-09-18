package xyz.lfans.leetcode.top.interview.questions.easy.array;

/**
 * @author MelancholyCat
 * @date Created in 21:08 2019-09-17
 * @description 旋转数组
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 * 尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。
 * 要求使用空间复杂度为 O(1) 的 原地 算法。
 */
public class A23 {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        if (nums.length < 2 || nums == null || k == 0)
            return;
        localrotate(nums, 0, n - k - 1);
        localrotate(nums, n - k, n - 1);
        localrotate(nums, 0, n - 1);
    }

    public static void localrotate(int[] arr, int i, int j) {
        while (i < j) {
            swap(arr, i++, j--);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int a = arr[i];
        arr[i] = arr[j];
        arr[j] = a;
    }
}
