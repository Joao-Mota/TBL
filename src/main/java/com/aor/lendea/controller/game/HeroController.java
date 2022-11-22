package com.aor.lendea.controller.game;

import com.aor.lendea.Game;
import com.aor.lendea.gui.GUI;
import com.aor.lendea.model.Position;
import com.aor.lendea.model.layout.arena.Arena;

public class HeroController extends GameController {
    public HeroController(Arena arena) {
        super(arena);
    }

    public void moveHeroLeft() {
        moveHero(getModel().getLendea().getPosition().getLeft());
    }

    public void moveHeroRight() {
        moveHero(getModel().getLendea().getPosition().getRight());
    }

    public void moveHeroUp() {
        moveHero(getModel().getLendea().getPosition().getUp());
    }

    public void moveHeroDown() {
        moveHero(getModel().getLendea().getPosition().getDown());
    }

    private void moveHero(Position position) {
        if (getModel().isEmpty(position)) {
            getModel().getLendea().setPosition(position);
            if (getModel().isMonster(position)) getModel().getLendea().decreaseHealth();
        }
    }

    @Override
    public void step(Game game, GUI.ACTION action, long time) {
        if (action == GUI.ACTION.UP) moveHeroUp();
        if (action == GUI.ACTION.RIGHT) moveHeroRight();
        if (action == GUI.ACTION.DOWN) moveHeroDown();
        if (action == GUI.ACTION.LEFT) moveHeroLeft();
    }
}
