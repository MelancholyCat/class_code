package xyz.lfans.class_01;

/**
 * @author MelancholyCat
 * @date Created in 15:04 2019-09-13
 * @description 插入排序
 * 每步将一个待排序的记录，按其关键码值的大小插入前面已经排序的文件中适当位置上，直到全部插入完为止。
 */
public class InsertionSort extends xyz.lfans.tools.Swap {
    public static void insertionSort(int[] arr) {
        //如果数组为空或者只有一个元素，不需要排序，直接返回原数组
        if(arr==null||arr.length<2){
            return;
        }
        //每步将一个待排序的记录，按其关键码值的大小插入前面已经排序的文件中适当位置上，直到全部插入完为止。
        for (int i = 1;i<arr.length;i++){
            for(int j=i-1;j>=0&&arr[j]>arr[j+1];j--){
                swap(arr,j,j+1);
            }
        }
    }

}
