package xyz.lfans.class_01;

/**
 * @author MelancholyCat
 * @date Created in 15:37 2019-09-11
 * @description 冒泡排序
 * 重复地走访过要排序的元素列，依次比较两个相邻的元素，如果他们的顺序（如从大到小、首字母从A到Z）错误就把他们交换过来。
 */
public class BubbleSort extends xyz.lfans.tools.Swap {

    /**
     * 传入一个数组
     * @param arr
     */
    public static void bubbleSort(int[] arr){
        //如果数组为空或者只有一个元素，不需要排序，直接返回原数组
        if(arr==null||arr.length<2){
            return ;
        }
        //重复地走访过要排序的元素列，依次比较两个相邻的元素，如果他们的顺序（如从大到小、首字母从A到Z）错误就把他们交换过来。
        for(int i = arr.length-1;i>0;i--){
            //逐对比较相邻两个数的大小，将大的数放到右边
            for (int j = 0;j<i;j++){
                if (arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }

}
