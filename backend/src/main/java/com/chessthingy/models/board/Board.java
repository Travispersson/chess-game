package com.chessthingy.models.board;

import java.util.ArrayList;
import java.util.List;

import com.chessthingy.models.common.Color;
import com.chessthingy.models.common.File;
import com.chessthingy.models.piece.ChessPiece;

public class Board {
    private List<List<Square>> board;
    private final Integer BOARD_LENGTH = 8;

    private List<List<Square>> buildBoard() {
        List<List<Square>> b = new ArrayList<>();
        for (int row = 0; row < this.BOARD_LENGTH; row++) {
            Color color = row % 2 == 0 ? Color.WHITE : Color.BLACK;
            List<Square> l = new ArrayList<>();
            for (File file : File.values()) {
                l.add(new Square(file, row+1, color));
                color = color == Color.WHITE ? Color.BLACK : Color.WHITE;
            }
            b.add(l);
        }
        return b;
    }

    public Board() {
        this.board = buildBoard();
    }

    public List<List<Square>> getBoard(){
        return this.board;
    }

    @Override
    public String toString() {
        String s = "";
        for (List<Square> l : this.board) {
            for (Square sq : l) {
                s += sq.toString();
            }
            s += "\n\n";
        }
        return s;
    }

}
