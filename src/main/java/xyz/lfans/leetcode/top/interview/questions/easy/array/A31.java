package xyz.lfans.leetcode.top.interview.questions.easy.array;

/**
 * @author MelancholyCat
 * @date Created in 16:12 2019-09-19
 * @description 旋转图像
 * 给定一个 n × n 的二维矩阵表示一个图像。
 * 将图像顺时针旋转 90 度。
 * 说明：
 * 你必须在原地旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要使用另一个矩阵来旋转图像。
 */

public class A31 {
    public void rotate(int[][] matrix) {
        int tL = 0;
        int tC = 0;
        int dL = matrix.length - 1;
        int dC = matrix[0].length - 1;
        while (dL > tL && dC > tC) {
            rotateMatrix(matrix, tL++, tC++, dL--, dC--);
        }
    }

    public void rotateMatrix(int[][] m, int tL, int tC, int dL, int dC) {
        int times = dC - tC;
        int tmp = 0;
        for (int i = 0; i != times; i++) {
            tmp = m[tL][tC + i];//临时存储上行的数
            m[tL][tC + i] = m[dL - i][tC];//左列的数移到上行
            m[dL - i][tC] = m[dL][dC - i];//下行的数移到左列
            m[dL][dC - i] = m[tL + i][dC];//右列的数移到下行
            m[tL + i][dC] = tmp;//把存起来的数放到右列
        }
    }
}
