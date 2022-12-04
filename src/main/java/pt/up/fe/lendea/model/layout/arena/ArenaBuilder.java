package pt.up.fe.lendea.model.layout.arena;

import pt.up.fe.lendea.model.layout.elements.*;

import java.util.ArrayList;
import java.util.List;

public abstract class ArenaBuilder {
    public Arena createArena() {
        Arena arena = new Arena(getWidth(), getHeight());

        arena.setExit(createExit());
        arena.setLendea(createLendea());
        arena.setMonsters(createMonsters());
        arena.setCoins(createCoins());
        arena.setWalls(createWalls());
        arena.setShots(createShots());

        return arena;
    }

    protected abstract int getWidth();

    protected abstract int getHeight();

    protected abstract List<Wall> createWalls();

    protected abstract List<Monster> createMonsters();

    protected abstract ArrayList<Coin> createCoins();

    protected abstract ArrayList<Shot> createShots();

    protected abstract Lendea createLendea();

    protected abstract Exit createExit();
}
