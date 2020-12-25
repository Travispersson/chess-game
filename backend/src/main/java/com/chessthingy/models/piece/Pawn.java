package com.chessthingy.models.piece;

import java.util.List;

import com.chessthingy.models.board.Board;
import com.chessthingy.models.board.Square;
import com.chessthingy.models.common.Color;

public class Pawn extends ChessPiece implements Movable {

    public Pawn(Color color) {
        super(color);
    }

    @Override
    public String getName() {
        return ("Pawn");
    }

    @Override
    public List<Square> generateValidMoves(Board b) {
        return null;
    }

    @Override
    public void move(Board b, Square sq) {

    }

}
