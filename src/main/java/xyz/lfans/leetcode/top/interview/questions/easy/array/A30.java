package xyz.lfans.leetcode.top.interview.questions.easy.array;

/**
 * @author MelancholyCat
 * @date Created in 11:12 2019-09-19
 * @description 有效的数独
 * 判断一个 9x9 的数独是否有效。只需要根据以下规则，验证已经填入的数字是否有效即可。
 * 1、数字 1-9 在每一行只能出现一次。
 * 2、数字 1-9 在每一列只能出现一次。
 * 3、数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。
 * 数独部分空格内已填入了数字，空白格用 '.' 表示。
 */

public class A30 {
    public boolean isValidSudoku(char[][] board) {
//        数字 1-9 在每一行只能出现一次
        for (int i = 0; i < board.length; i++) {
            int[] ints = new int[9];
            for (int j = 0; j < board[i].length; j++) {
                int num = charToInt(board[i][j]);
                if (num != 0) {
                    if (ints[num - 1] == 1)
                        return false;
                    else
                        ints[num - 1] = 1;
                }
            }
        }
//        数字 1-9 在每一列只能出现一次
        for (int i = 0; i < 9; i++) {
            int[] ints = new int[9];
            for (int j = 0; j < 9; j++) {
                int num = charToInt(board[j][i]);
                if (num != 0) {
                    if (ints[num - 1] == 1)
                        return false;
                    else
                        ints[num - 1] = 1;
                }
            }
        }
//        数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。
        for (int line = 0; line < 9; line += 3) {
            for (int col = 0; col < 9; col += 3) {
                int[] ints = new int[9];
                for (int i = line; i < line + 3; i++) {
                    for (int j = col; j < col + 3; j++) {
                        int num = charToInt(board[i][j]);
                        if (num != 0) {
                            if (ints[num - 1] == 1)
                                return false;
                            else
                                ints[num - 1] = 1;
                        }
                    }
                }
            }
        }

        return true;
    }

    public int charToInt(char ch) {
        if (ch == '1')
            return 1;
        else if (ch == '2')
            return 2;
        else if (ch == '3')
            return 3;
        else if (ch == '4')
            return 4;
        else if (ch == '5')
            return 5;
        else if (ch == '6')
            return 6;
        else if (ch == '7')
            return 7;
        else if (ch == '8')
            return 8;
        else if (ch == '9')
            return 9;
        return 0;
    }
}
