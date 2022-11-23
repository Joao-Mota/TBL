package com.aor.lendea.model.layout.elements;

import com.aor.lendea.model.Position;

public class Element {

    public Element(){}
    private Position position;

    public Element(int x, int y) {
        this.position = new Position(x, y);
    }

    public Position getPosition() {
        return this.position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
