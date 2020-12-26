package com.chessthingy.models.board;

import com.chessthingy.models.common.Color;
import com.chessthingy.models.common.File;
import com.chessthingy.models.piece.ChessPiece;

public class Square {

    private final Position position;
    private final Color color;
    private boolean isOccupied = false;
    private ChessPiece piece = null;

    public Square(File file, Integer rank, Color color) {
        this.position = new Position(file, rank);
        this.color = color;
    }

    /**
     * empties the square
     */
    public void empty() {
        this.isOccupied = false;
        this.piece = null;
    }

    public ChessPiece getPiece() {
        return this.piece;
    }

    public void setPiece(ChessPiece piece) {
        this.piece = piece;
        this.isOccupied = true;
    }

    public Position getPosition() {
        return this.position;
    }

    public Color getColor() {
        return this.color;
    }

    public boolean isOccupied() {
        return this.isOccupied;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if(o instanceof Square){
            return equals((Square) o);
        }

        return false;
    }

    public boolean equals(Square s) {

        if (this.position.equals(s.getPosition()) && this.color == s.getColor()) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Square [color=" + color + ", isOccupied=" + isOccupied + ", piece=" + piece + ", position=" + position
                + "]";
    }

}
