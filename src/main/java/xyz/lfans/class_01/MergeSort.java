package xyz.lfans.class_01;

/**
 * @author MelancholyCat
 * @date Created in 19:18 2019-09-16
 * @description
 */
public class MergeSort extends xyz.lfans.tools.Swap {
    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        mergeSort(arr,0,arr.length-1);
    }

    public static void mergeSort(int[] arr,int l,int r) {

    }

    public static void merge(int[] arr,int l,int m,int r) {
        int[] help = new int[r-l+1];
        int i = 0;

    }

}
