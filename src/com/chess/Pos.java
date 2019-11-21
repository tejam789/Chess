package com.chess;

public class Pos {
    private final int xCoOrd;
    private final int yCoOrd;

    public Pos(int xCoOrd, int yCoOrd) {
        this.xCoOrd = xCoOrd;
        this.yCoOrd = yCoOrd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pos)) return false;
        Pos pos = (Pos) o;
        return xCoOrd == pos.xCoOrd &&
                yCoOrd == pos.yCoOrd;
    }
}
