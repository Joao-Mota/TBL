package com.aor.lendea.model.layout.arena;

import com.aor.lendea.model.layout.elements.Coin;
import com.aor.lendea.model.layout.elements.Lendea;
import com.aor.lendea.model.layout.elements.Monster;
import com.aor.lendea.model.layout.elements.Wall;

import java.util.ArrayList;
import java.util.List;

public abstract class ArenaBuilder {
    public Arena createArena() {
        Arena arena = new Arena(getWidth(), getHeight());

        arena.setLendea(createLendea());
        arena.setMonsters(createMonsters());
        arena.setCoins(createCoins());
        arena.setWalls(createWalls());

        return arena;
    }

    protected abstract int getWidth();

    protected abstract int getHeight();

    protected abstract List<Wall> createWalls();

    protected abstract List<Monster> createMonsters();

    protected abstract ArrayList<Coin> createCoins();

    protected abstract Lendea createLendea();
}
