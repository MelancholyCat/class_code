package xyz.lfans.class_01;

/**
 * @author MelancholyCat
 * @date Created in 09:32 2019-09-16
 * @description
 */
public class QuickSort extends xyz.lfans.tools.Swap {

    public static void quickSort(int[] arr){
        if(arr==null||arr.length<2){
            return;
        }
        quickSort(arr,0,arr.length-1);
    }

    /**
     * 使数组在l->r上有序
     * @param arr 待排序的数组
     * @param l 左边界
     * @param r 右边界
     */
    public static void quickSort(int[] arr,int l,int r){
        if (l<r){
            /*swap(arr,l+(int)(Math.random()*(r-l+1)),r);*/
            int[] p = partition(arr, l, r);
            quickSort(arr,l,p[0]-1);
            quickSort(arr,p[1]+1,r);
        }
    }

    /**
     *
     * @param arr 待排序的数组
     * @param l 左边界
     * @param r 右边界
     * @return 等于区域的左右边界
     */
    public static int[] partition(int[] arr,int l,int r){
        int less = l-1;
        int more = r+1;
        //arr[r]作为基准值
        while (l<more){
            if (arr[l]<arr[r]){
                swap(arr,++less,l++);
            }else if (arr[l]>arr[r]){
                swap(arr,--more,l);
            }else{
                l++;
            }
        }
        swap(arr,more,r);
        return new int[]{less+1,more};
    }




}
