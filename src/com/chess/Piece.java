package com.chess;

import java.util.List;

public abstract class Piece {

    private boolean isKilled;

    public Piece() {
        this.isKilled = false;
    }

    public abstract void move();

    public abstract List<Pos> getPosibleMoves();

    public abstract boolean isKilled();

    public boolean kill(){
        this.isKilled = true;
        return this.isKilled;
    }
}
