package pt.up.fe.lendea.model.layout.arena;

import pt.up.fe.lendea.model.Position;
import pt.up.fe.lendea.model.layout.elements.*;
import pt.up.fe.lendea.model.layout.elements.monsters.*;

import java.util.List;

public class Arena {
    private final int width;
    private final int height;


    private Lendea lendea;
    private List<Monster> monsters;
    private List<Coin> coins;
    private List<Wall> walls;
    private List<Shot> shots;
    private List<Boss> bosses;
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

    public List<Boss> getBosses() {return bosses;}
    public void setBosses(List<Boss> bosses) {this.bosses = bosses;}

    public List<Coin> getCoins() {return coins;}
    public void setCoins(List<Coin> coins) {this.coins = coins;}

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

    public void removeShot(Shot shot) {
        shots.remove(shot);
    }


    public List<Wall> getWalls() {
        return walls;
    }

    public void setWalls(List<Wall> walls) {
        this.walls = walls;
    }

    public List<Shot> getShots() {return shots;}

    public void setShots(List<Shot> shots) {this.shots = shots;}

    public void update(Shot shot) {
        shots.add(shot);
    }

    public Exit getExit() {return  exit;}
    public void setExit(Exit exit) {this.exit = exit;}

    public boolean isNotWall(Position position) {
        for (Wall wall : walls)
            if (wall.getPosition().equals(position))
                return false;
        return true;
    }

    public boolean isShot(Position position) {
        for (Shot shot : shots)
            if (shot.getPosition().equals(position))
                return true;
        return false;
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
