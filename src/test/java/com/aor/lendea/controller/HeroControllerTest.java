package com.aor.lendea.controller;

import com.aor.lendea.controller.game.LendeaController;
import com.aor.lendea.model.Position;
import com.aor.lendea.model.layout.arena.Arena;
import com.aor.lendea.model.layout.elements.Exit;
import com.aor.lendea.model.layout.elements.Lendea;
import com.aor.lendea.model.layout.elements.Wall;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HeroControllerTest {
    private LendeaController controller;
    private Lendea lendea;
    private Arena arena;

    @BeforeEach
    void setUp() {
        arena = new Arena(10, 10);

        lendea = new Lendea(5, 5);
        arena.setLendea(lendea);

        arena.setWalls(Arrays.asList());
        arena.setMonsters(Arrays.asList());
        arena.setCoins(Arrays.asList());
        arena.setShots(Arrays.asList());
        arena.setExit(new Exit(10, 9));

        controller = new LendeaController(arena);
    }

    @Test
    void moveHeroRightEmpty() {
        controller.moveLendeaRight();
        assertEquals(new Position(6, 5), lendea.getPosition());
    }

    @Test
    void moveHeroRightNotEmpty() {
        arena.setWalls(Arrays.asList(new Wall(6, 5)));
        controller.moveLendeaRight();
        assertEquals(new Position(5, 5), lendea.getPosition());
    }
}