package xyz.lfans.tools;

import java.util.Arrays;

/**
 * @author MelancholyCat
 * @date Created in 16:15 2019-09-13
 * @description 数组工具类
 * 包含：随机数组生成器，数组拷贝，判断两个数组是否一样，数组排序（原生）
 */
public class ArrayTools {

    /**
     * 随机数组生成器
     * @param maxSize 生成数组的可能的最大空间
     * @param maxValue 随机生成的数组可能的最大值
     * @return 随机生成的数组
     */
    public static int[] generateRandomArray(int maxSize, int maxValue) {
        int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
        }
        return arr;
    }

    //拷贝数组
    public static int[] copyArray(int[] arr) {
        if (arr == null) {
            return null;
        }
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }
        return res;
    }

    //判断两个数组是否一样
    public static boolean isEqual(int[] arr1, int[] arr2) {
        if ((arr1 == null && arr2 != null) || (arr1 != null && arr2 == null)) {
            return false;
        }
        if (arr1 == null && arr2 == null) {
            return true;
        }
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    //打印数组
    public static void printArray(int[] arr) {
        if (arr == null) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //数组排序（原生）
    public static void comparator(int[] arr) {
        Arrays.sort(arr);
    }
}
