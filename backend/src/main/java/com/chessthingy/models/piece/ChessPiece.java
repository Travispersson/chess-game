package com.chessthingy.models.piece;

import com.chessthingy.models.board.Square;
import com.chessthingy.models.common.*;

public abstract class ChessPiece {
    private final Color color;
    private Square square;

    public ChessPiece(Color color) {
        this.color = color;
    }

    public String getName() {
        throw new RuntimeException("getName() called on abstract piece!");
    }

    public Color getColor() {
        return this.color;
    }

    public Square getSquare() {
        return this.square;
    }

    public void setSquare(Square square) {
        this.square = square;
    }

}
