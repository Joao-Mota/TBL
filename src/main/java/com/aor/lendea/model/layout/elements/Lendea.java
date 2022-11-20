package com.aor.lendea.model.layout.elements;

public class Lendea extends Element {
    private int energy;

    public Lendea(int x, int y) {
        super(x, y);
        this.energy = 100;
    }

    public void decreaseEnergy() {
        this.energy--;
    }

    public int getEnergy() {
        return energy;
    }
}
