package com.aor.lendea.model.layout.arena;

import com.aor.lendea.model.layout.elements.Coin;
import com.aor.lendea.model.layout.elements.Lendea;
import com.aor.lendea.model.layout.elements.Monster;
import com.aor.lendea.model.layout.elements.Wall;
import com.aor.lendea.model.layout.elements.monsters.MonsterCamelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomArenaBuilder extends ArenaBuilder {
    private final Random rng;

    private final int width;
    private final int height;
    private final int numberOfMonsters;
    private final int numberOfCoins;

    public RandomArenaBuilder(int width, int height, int numberOfMonsters, int numberOfCoins) {
        this.rng = new Random();

        this.width = width;
        this.height = height;
        this.numberOfMonsters = numberOfMonsters;
        this.numberOfCoins = numberOfCoins;
    }

    @Override
    protected int getWidth() {
        return width;
    }

    @Override
    protected int getHeight() {
        return height;
    }

    @Override
    protected List<Wall> createWalls() {
        List<Wall> walls = new ArrayList<>();

        for (int x = 0; x < width; x++) {
            walls.add(new Wall(x, 0));
            walls.add(new Wall(x, height - 1));
        }

        for (int y = 1; y < height - 1; y++) {
            walls.add(new Wall(0, y));
            walls.add(new Wall(width - 1, y));
        }

        return walls;
    }

    @Override
    protected List<Monster> createMonsters() {
        List<Monster> monsters = new ArrayList<>();

        while (monsters.size() < numberOfMonsters)
            monsters.add(new MonsterCamelo(rng.nextInt(width - 2) + 1, rng.nextInt(height - 2) + 1));

        return monsters;
    }

    @Override
    protected List<Coin> createCoins() {
        List<Coin> coins = new ArrayList<>();

        while (coins.size() < numberOfCoins)
            coins.add(new Coin(rng.nextInt(width - 2) + 1, rng.nextInt(height - 2) + 1));

        return coins;
    }

    @Override
    protected Lendea createLendea() {
        return new Lendea(width / 2, height / 2);
    }
}
