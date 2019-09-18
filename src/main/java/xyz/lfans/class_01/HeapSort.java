package xyz.lfans.class_01;

/**
 * @author MelancholyCat
 * @date Created in 20:49 2019-09-13
 * @description 堆排序
 */
public class HeapSort extends xyz.lfans.tools.Swap {
    public static void heapSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        //    建立大根堆 时间复杂度O(logN)
        for (int i = 0; i < arr.length; i++) {
            heapInsert(arr, i);
        }
        int size = arr.length;
        //最后位置上的数和0位置上的数交换
        swap(arr, 0, --size);
        //直到size被剪成0
        while (size > 0) {
            //从0位置开始，当前形成的堆继续调出一个大根堆
            heapify(arr, 0, size);
            //再跟0位置上的数交换
            swap(arr, 0, --size);
        }
    }

    /**
     * 如果某一个值突然变化了，使用此方法调整堆
     * @param arr 当前堆
     * @param index 当前节点下标
     * @param heapsize 堆的大小
     */
    private static void heapify(int[] arr, int index, int heapsize) {
        int left = index * 2 + 1;
        while (left < heapsize) {
            int largest = left + 1 < heapsize && arr[left + 1] > arr[left] ? left + 1 : left;
            largest = arr[largest] > arr[index] ? largest : index;
            if (largest == index) {
                break;
            }
            swap(arr, largest, index);
            index = largest;
            left = index * 2 + 1;
        }
    }


    //    将新节点往上调整
    private static void heapInsert(int[] arr, int index) {
        while (arr[index] > arr[(index - 1) / 2]) {
            swap(arr, index, (index - 1) / 2);
            index = (index - 1) / 2;
        }
    }

}
