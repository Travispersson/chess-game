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
}
