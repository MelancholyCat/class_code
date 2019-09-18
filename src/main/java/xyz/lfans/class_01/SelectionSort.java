package xyz.lfans.class_01;

/**
 * @author MelancholyCat
 * @date Created in 20:25 2019-09-13
 * @description 选择排序
 */
public class SelectionSort extends xyz.lfans.tools.Swap {
    public static void selectionSort(int[] arr) {
        if(arr==null||arr.length<2){
            return;
        }
        //每一次从待排序的数据元素中选出最小（或最大）的一个元素，存放在序列的起始位置
        for (int i = 0;i<arr.length-1;i++){
            int minIndex = i;
            for (int j = i+1;j<arr.length-1;i++){
                minIndex = arr[j]>arr[minIndex]?j : minIndex;
            }
            swap(arr,i,minIndex);
        }
    }

}
