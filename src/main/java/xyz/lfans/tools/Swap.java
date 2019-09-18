package xyz.lfans.tools;

/**
 * @author MelancholyCat
 * @date Created in 10:43 2019-09-16
 * @description
 */
public class Swap {
    public static void swap(int[] arr, int i, int j) {
        //异或操作交换两个元素的值
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
}
