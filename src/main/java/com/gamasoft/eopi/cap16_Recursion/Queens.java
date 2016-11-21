package com.gamasoft.eopi.cap16_Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by uberto on 21/11/16.
 */
public class Queens {

    public static List<Board> generate(int size) {
        List<Board> res = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            Board b = new Board(size);
            b.set(0, i);
            placeQueens(b, 1, res);
        }


        return res;
    }

    private static void placeQueens(Board board, int level, List<Board> boardList) {

        int size = board.size();

        if (level == size){
            boardList.add(board);
            return;
        }

        for (int i = 0; i < size; i++) {

            if (board.isValid(level, i)) {
                Board b = board.cloneBoard();
                b.set(level, i);
                placeQueens(b, level + 1, boardList);
            }
        }
    }

    public static class Board extends ArrayList<Integer> {
        public Board(int initialCapacity) {
            super(initialCapacity);
            for (int i = 0; i < initialCapacity; i++) {
                add(-1);
            }
        }

        @Override
        public String toString() {
            return stream().map(Object::toString).collect(Collectors.joining(""));
        }

        public boolean isValid(int row, int col) {

            for (int i = 0; i < size() - 1; i++) {
                if (get(i) == -1)
                    continue;
                if (get(i) == col)
                    return false;
                if (get(i) == col + row - i)
                    return false;
                if (get(i) == col - row + i)
                    return false;
            }
            return true;
        }

        public Board cloneBoard() {
            return (Board) clone();
        }
    }

}
