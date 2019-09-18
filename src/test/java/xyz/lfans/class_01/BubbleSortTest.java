package xyz.lfans.class_01;

import org.junit.Test;
import xyz.lfans.tools.ArrayTools;

import static org.junit.Assert.*;

/**
 * @author MelancholyCat
 * @date Created in 16:26 2019-09-13
 * @description
 */
public class BubbleSortTest {

    @Test
    public void bubbleSort() {
        int[] ints = ArrayTools.generateRandomArray(100, 20);
        int[] ints1 = ArrayTools.copyArray(ints);
        ArrayTools.comparator(ints);

//        BubbleSort.bubbleSort(ints1);
//        ArrayTools.printArray(ints1);

        InsertionSort.insertionSort(ints1);
        ArrayTools.printArray(ints1);

    }
}