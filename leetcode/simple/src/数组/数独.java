package 数组;

import java.awt.*;
import java.lang.invoke.VolatileCallSite;
import java.util.HashMap;
import java.util.HashSet;
import java.util.regex.Pattern;

/**
 * @Classname 数组.数独
 * @Description TODO
 * @Date 2020/10/2 17:21
 * @Created by 94493
 */
public class 数独 {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            HashSet<Character> hashSet = new HashSet<>();
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != '.' && !hashSet.add(board[i][j])) {
                    return false;
                }
            }
        }
        for (int i = 0; i < board[0].length; i++) {
            HashSet<Character> hashSet = new HashSet<>();
            for (int j = 0; j < board.length; j++) {
                if (board[j][i] != '.' && !hashSet.add(board[j][i])) {
                    return false;
                }
            }
        }

        for (int r = 0; r <= 6; r += 3) {
            for (int c = 0; c <= 6; c += 3) {
                HashSet<Character> hashSet = new HashSet<>();
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (board[r + i][j + c] != '.' && !hashSet.add(board[r + i][j + c])) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }




    public boolean isValidSudoku1(char[][] board) {
        HashMap<Character, Integer>[] rows = new HashMap[9];//行
        HashMap<Character, Integer>[] columns = new HashMap[9];//列
        HashMap<Character, Integer>[] blocks = new HashMap[9];//块

        for(int i=0;i<9;i++){
            rows[i] = new HashMap<>();
            columns[i] = new HashMap<>();
            blocks[i] = new HashMap<>();
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != '.') {
                    Character character = board[i][j];
                    int block = (i / 3) * 3 + j / 3;//看在第几个块
                    rows[i].put(character, rows[i].getOrDefault(character, 0) + 1);
                    columns[j].put(character, columns[j].getOrDefault(character, 0) + 1);
                    blocks[block].put(character, blocks[block].getOrDefault(character, 0) + 1);
                    if (rows[i].get(character) > 1 || columns[j].get(character) > 1 || blocks[block].get(character) > 1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
