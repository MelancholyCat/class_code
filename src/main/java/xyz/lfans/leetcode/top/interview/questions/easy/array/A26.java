package xyz.lfans.leetcode.top.interview.questions.easy.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author MelancholyCat
 * @date Created in 10:58 2019-09-18
 * @description 两个数组的交集 II
 * 给定两个数组，编写一个函数来计算它们的交集。
 * 输出结果中每个元素出现的次数，应与元素在两个数组中出现的次数一致。
 * 我们可以不考虑输出结果的顺序。
 * 进阶:
 * 如果给定的数组已经排好序呢？你将如何优化你的算法？
 * 如果 nums1 的大小比 nums2 小很多，哪种方法更优？
 * 如果 nums2 的元素存储在磁盘上，磁盘内存是有限的，并且你不能一次加载所有的元素到内存中，你该怎么办？
 */

public class A26 {

    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null)
            return null;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] nums = new int[nums1.length > nums2.length ? nums1.length : nums2.length];
        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j])
                i++;
            else if (nums1[i] > nums2[j])
                j++;
            else {
                nums[k++] = nums1[i++];
                j++;
            }
        }
        int[] arr = new int[k];
        for (int n = 0; n < k; n++) {
            arr[n] = nums[n];
        }
        return arr;
    }

    /*public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        int[] nums = new int[nums1.length>nums2.length?nums1.length:nums2.length];
        int num = 0;
        for (int i = 0;i<nums1.length;i++){
            if (map.get(nums1[i])==null){
                map.put(nums1[i],1);
            }else
                map.put(nums1[i],map.get(nums1[i])+1);
        }
        for (int i = 0;i<nums2.length;i++){
            if (map.get(nums2[i])!=null&&map.get(nums2[i])>0){
                nums[num++] = nums2[i];
                map.put(nums2[i],map.get(nums2[i])-1);
            }
        }
        int[] ints = new int[num];
        for (int i=0;i<num;i++){
            ints[i] = nums[i];
        }
        return ints;
    }*/

}
