package com.aor.lendea.model.layout.arena;

import com.aor.lendea.model.Position;
import com.aor.lendea.model.layout.elements.Coin;
import com.aor.lendea.model.layout.elements.Lendea;
import com.aor.lendea.model.layout.elements.Monster;
import com.aor.lendea.model.layout.elements.Wall;

import java.util.ArrayList;
import java.util.List;

public class Arena {
    private final int width;
    private final int height;

    private Lendea lendea;
    private List<Monster> monsters;
    private ArrayList<Coin> coins;
    private List<Wall> walls;

    public Arena(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Lendea getLendea() { return lendea; }

    public void setLendea(Lendea lendea) {
        this.lendea = lendea;
    }

    public List<Monster> getMonsters() {
        return monsters;
    }

    public void setMonsters(List<Monster> monsters) {
        this.monsters = monsters;
    }

    public ArrayList<Coin> getCoins() {return coins;}
    public void setCoins(ArrayList<Coin> coins) {this.coins = coins;}

    public void removeCoin() {
        for(Coin coin : coins){
            if(getLendea().getPosition().equals(coin.getPosition())) {
                coins.remove(coin);
                break;
            }
        }
    }

    public List<Wall> getWalls() {
        return walls;
    }

    public void setWalls(List<Wall> walls) {
        this.walls = walls;
    }

    public boolean isEmpty(Position position) {
        for (Wall wall : walls)
            if (wall.getPosition().equals(position))
                return false;
        return true;
    }

    public boolean isMonster(Position position) {
        for (Monster monster : monsters)
            if (monster.getPosition().equals(position))
                return true;
        return false;
    }

    public boolean isCoin(Position position) {
        for (Coin coin : coins)
            if (coin.getPosition().equals(position))
                return true;
        return false;
    }
}
