package com.aor.lendea.model.layout.arena;

import com.aor.lendea.model.Position;
import com.aor.lendea.model.layout.elements.*;

import java.util.ArrayList;
import java.util.List;

public class Arena {
    private final int width;
    private final int height;


    private Lendea lendea;
    private List<Monster> monsters;
    private ArrayList<Coin> coins;
    private List<Wall> walls;
    private ArrayList<Shot> shots;
    private Exit exit;

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

    public void removeMonster(Shot shot) {
        for(Monster monster : monsters){
            if(monster.getPosition().equals(shot.getPosition())) {
                monsters.remove(monster);
                break;
            }
        }
    }

    public boolean isColliding(Shot shot) {
        for(Wall wall : walls) {
            if(wall.getPosition().equals(shot.getPosition())) return true;
        }
        for(Monster monster : monsters) {
            if(monster.getPosition().equals(shot.getPosition())) return true;
        }
        return false;
    }

    public void removeShot(Shot shot) {
        if(isColliding(shot)) {
            shots.remove(shot);
        }
    }

    public List<Wall> getWalls() {
        return walls;
    }

    public void setWalls(List<Wall> walls) {
        this.walls = walls;
    }

    public ArrayList<Shot> getShots() {return shots;}

    public void setShots(ArrayList<Shot> shots) {this.shots = shots;}

    public void update(Shot shot) {
        shots.add(shot);
    }
/*
    public void checkCollisions() {
        List<Shot> collided = new java.util.ArrayList<>();
        for (Element element : elements) {
            for (Shot shot : shots) {
                if (shot.collideWith(element)) {
                    element.damage();
                    collided.add(shot);
                }
            }
        }
        shots.removeAll(collided);
    }
*/
    public Exit getExit() {return  exit;}
    public void setExit(Exit exit) {this.exit = exit;}

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

    public boolean isExit(Position position) {
        if (exit.getPosition().equals(position))
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
