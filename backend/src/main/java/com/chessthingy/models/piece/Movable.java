package com.chessthingy.models.piece;

import com.chessthingy.models.board.*;
import java.util.*;

public interface Movable {

    public void move(Board b, Square sq);
    public List<Square> generateValidMoves(Board b);

}
