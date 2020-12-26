package com.chessthingy.models.board;

import com.chessthingy.models.common.*;

public class Position {
    private final File file;
    private final Integer rank;

    public Position(File file, Integer rank) {
        this.file = file;
        this.rank = rank;
    }

    public File getFile() {
        return file;
    }

    public Integer getRank() {
        return rank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Position) {
            return equals((Position) o);
        }

        return false;
    }

    public boolean equals(Position pos) {
        return (this.file == pos.getFile() && this.rank == pos.getRank());
    }

    @Override
    public String toString() {
        return "Position [file=" + file + ", rank=" + rank + "]";
    }
    
}
