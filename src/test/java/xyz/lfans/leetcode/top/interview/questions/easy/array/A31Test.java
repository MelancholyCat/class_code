package xyz.lfans.leetcode.top.interview.questions.easy.array;

import org.junit.Test;

import java.util.jar.JarEntry;

import static org.junit.Assert.*;

/**
 * @author MelancholyCat
 * @date Created in 16:46 2019-09-19
 * @description
 */

public class A31Test {

    @Test
    public void rotate() {
        A31 a31 = new A31();
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        a31.rotate(matrix);
        for (int i = 0;i<matrix.length;i++){
            for (int j = 0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}