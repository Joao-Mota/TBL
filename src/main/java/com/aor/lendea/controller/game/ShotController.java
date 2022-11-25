package com.aor.lendea.controller.game;

import com.aor.lendea.Game;
import com.aor.lendea.gui.GUI;
import com.aor.lendea.model.Position;
import com.aor.lendea.model.layout.arena.Arena;
import com.aor.lendea.model.layout.elements.Shot;

import java.io.IOException;

public class ShotController extends GameController{
    private long lastMovement;

    public ShotController(Arena arena) {
        super(arena);
        this.lastMovement = 0;
    }

    @Override
    public void step(Game game, GUI.ACTION action, long time) throws IOException {
        if (time - lastMovement > 500) {
            for (Shot shot : getModel().getShots())
                moveShot(shot, shot.getPosition().movingShot(shot.getFloatX(), shot.getSpeed()));
            this.lastMovement = time;
        }
    }

    private void moveShot(Shot shot, Position position) {
        if (getModel().isEmpty(position)) {
            shot.setPosition(position);
        }
        getModel().removeMonster(shot);
        getModel().removeShot(shot);
    }
}
