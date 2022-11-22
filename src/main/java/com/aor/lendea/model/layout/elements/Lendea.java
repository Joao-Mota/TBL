package com.aor.lendea.model.layout.elements;

public class Lendea extends Element {
    private int health;
    private int strike;
    private int defense;


    public Lendea(int x, int y) {
        super(x, y);
        this.health = 100;
        this.strike = 10;
        this.defense = 10;
    }

    public void decreaseHealth() {
        this.health--;
    }
    public void incrementHealth() {this.health++;}

    public int getHealth() {
        return health;
    }

    public void decreaseStrike() {
        this.strike--;
    }
    public void incrementStrike() {this.strike++;}

    public int getStrike() {return strike;}

    public void decreaseDefense() {
        this.defense--;
    }
    public void incrementDefense() {this.defense++;}

    public int getDefense() {
        return defense;
    }
}
