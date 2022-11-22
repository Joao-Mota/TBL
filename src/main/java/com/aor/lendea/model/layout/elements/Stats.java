package com.aor.lendea.model.layout.elements;

public class Stats extends Element{
    // defines the stats of Lendea & its enemies
    private int health;
    private int attack;
    private int defense;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}
