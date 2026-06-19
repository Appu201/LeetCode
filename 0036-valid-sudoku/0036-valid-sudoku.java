import java.util.*;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            HashSet<Character> rowSet = new HashSet<>();
            HashSet<Character> colSet = new HashSet<>();
            HashSet<Character> boxSet = new HashSet<>();

            for (int j = 0; j < 9; j++) {
                char rowChar = board[i][j];
                char colChar = board[j][i];
                char boxChar = board[(i/3)*3 + j/3][(i%3)*3 + j%3];

                if (rowChar != '.' && !rowSet.add(rowChar)) return false;
                if (colChar != '.' && !colSet.add(colChar)) return false;
                if (boxChar != '.' && !boxSet.add(boxChar)) return false;
            }
        }
        return true;
    }
}

