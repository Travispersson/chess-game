package com.chessthingy.models.piece;

import java.util.List;

import com.chessthingy.models.board.Board;
import com.chessthingy.models.board.Square;
import com.chessthingy.models.common.Color;

public class King extends ChessPiece implements Movable {

    public King(Color color) {
        super(color);
    }

    @Override
    public String getName() {
        return ("King");
    }

    @Override
    public List<Square> generateValidMoves(Board b) {
        return null;
    }

    @Override
    public void move(Board b, Square sq) {

    }
}