package xyz.lfans.leetcode.top.interview.questions.easy.array;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author MelancholyCat
 * @date Created in 15:29 2019-09-19
 * @description
 */

public class A30Test {

    @Test
    public void isValidSudoku() {
        A30 a30 = new A30();
        char[][] board = {
                {'8','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','1','.','.','.','.','6','.'},
                {'1','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}};

        boolean validSudoku = a30.isValidSudoku(board);
        System.out.println(validSudoku);
    }
}