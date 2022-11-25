package com.aor.lendea.controller.game;

import com.aor.lendea.Game;
import com.aor.lendea.gui.GUI;
import com.aor.lendea.model.Position;
import com.aor.lendea.model.layout.arena.Arena;
import com.aor.lendea.model.layout.elements.LendeaShot;

public class LendeaController extends GameController {
    public LendeaController(Arena arena) {
        super(arena);
    }

    public void moveLendeaLeft() {
        moveLendea(getModel().getLendea().getPosition().getLeft());
    }

    public void moveLendeaRight() {
        moveLendea(getModel().getLendea().getPosition().getRight());
    }

    public void moveLendeaUp() {
        moveLendea(getModel().getLendea().getPosition().getUp());
    }

    public void moveLendeaDown() {
        moveLendea(getModel().getLendea().getPosition().getDown());
    }

    private void moveLendea(Position position) {
        if (getModel().isNotWall(position)) {
            getModel().getLendea().setPosition(position);
            if (getModel().isMonster(position)) getModel().getLendea().decreaseHealth();
            if (getModel().isCoin(position)) {
                getModel().getLendea().incrementCoins();
            }
            if (getModel().isExit(position) && getModel().getCoins().size() == 0) {
                getModel().getLendea().setWin(true);
            }
        }
        getModel().removeCoin();
    }

    private void fire() {
        getModel().update(new LendeaShot(getModel().getLendea().getPosition().getX() - 1, getModel().getLendea().getPosition().getY()));
    }

    @Override
    public void step(Game game, GUI.ACTION action, long time) {
        if (action == GUI.ACTION.UP) moveLendeaUp();
        if (action == GUI.ACTION.RIGHT) moveLendeaRight();
        if (action == GUI.ACTION.DOWN) moveLendeaDown();
        if (action == GUI.ACTION.LEFT) moveLendeaLeft();
        if (action == GUI.ACTION.FIRE) fire();
    }
}
