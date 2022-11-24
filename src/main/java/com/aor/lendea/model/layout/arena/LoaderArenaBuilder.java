package com.aor.lendea.model.layout.arena;

import com.aor.lendea.model.layout.elements.*;
import com.aor.lendea.model.layout.elements.monsters.MonsterCamelo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class LoaderArenaBuilder extends ArenaBuilder {
    private final int layout;
    private final List<String> lines;

    public LoaderArenaBuilder(int layout) throws IOException {
        this.layout = layout;

        URL resource = LoaderArenaBuilder.class.getResource("/layout/layout.lvl");
        BufferedReader br = new BufferedReader(new FileReader(resource.getFile()));

        lines = readLines(br);
    }

    private List<String> readLines(BufferedReader br) throws IOException {
        List<String> lines = new ArrayList<>();
        for (String line; (line = br.readLine()) != null; )
            lines.add(line);
        return lines;
    }

    @Override
    protected int getWidth() {
        int width = 0;
        for (String line : lines)
            width = Math.max(width, line.length());
        return width;
    }

    @Override
    protected int getHeight() {
        return lines.size();
    }

    @Override
    protected List<Wall> createWalls() {
        List<Wall> walls = new ArrayList<>();

        for (int y = 0; y < lines.size(); y++) {
            String line = lines.get(y);
            for (int x = 0; x < line.length(); x++)
                if (line.charAt(x) == '#' || line.charAt(x) == '|') walls.add(new Wall(x, y));
        }

        return walls;
    }

    @Override
    protected List<Monster> createMonsters() {
        List<Monster> monsters = new ArrayList<>();

        for (int y = 0; y < lines.size(); y++) {
            String line = lines.get(y);
            for (int x = 0; x < line.length(); x++)
                if (line.charAt(x) == 'M') monsters.add(new MonsterCamelo(x, y));
        }

        return monsters;
    }

    @Override
    protected ArrayList<Coin> createCoins() {
        ArrayList<Coin> coins = new ArrayList<>();

        for (int y = 0; y < lines.size(); y++) {
            String line = lines.get(y);
            for (int x = 0; x < line.length(); x++)
                if (line.charAt(x) == '$') coins.add(new Coin(x, y));
        }

        return coins;
    }

    @Override
    protected ArrayList<Shot> createShots() {
        ArrayList<Shot> shots = new ArrayList<>();

        for (int y = 0; y < lines.size(); y++) {
            String line = lines.get(y);
            for (int x = 0; x < line.length(); x++)
                if (line.charAt(x) == '-') shots.add(new LendeaShot(x, y));
        }

        return shots;
    }

    @Override
    protected Lendea createLendea() {
        for (int y = 0; y < lines.size(); y++) {
            String line = lines.get(y);
            for (int x = 0; x < line.length(); x++)
                if (line.charAt(x) == 'L') return new Lendea(x, y);
        }
        return null;
    }

    @Override
    protected Exit createExit() {
        for (int y = 0; y < lines.size(); y++) {
            String line = lines.get(y);
            for (int x = 0; x < line.length(); x++)
                if (line.charAt(x) == 'E') return new Exit(x, y);
        }
        return null;
    }
}