package xyz.lfans.class_01;

/**
 * @author MelancholyCat
 * @date Created in 15:37 2019-09-11
 * @description 冒泡排序
 */
public class BubbleSort {

    /**
     * 传入一个数组
     * @param arr
     */
    public static int[] bubbleSort(int[] arr){
        //如果数组为空或者只有一个元素，不需要排序，直接返回原数组
        if(arr==null||arr.length<2){
            return arr;
        }
        //将每个循环中最大的值放到数组排序区的最后，再把排序区范围减1
        for(int i = arr.length-1;i>0;i--){
            //逐对比较相邻两个数的大小，将大的数放到右边
            for (int j = 0;j<i;j++){
                if (arr[i]>arr[i+1]){
                    swap(arr,i,i+1);
                }
            }
        }
        return arr;
    }

    public static void swap(int[] arr,int i ,int j){
        //异或操作交换两个元素的值
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
}
