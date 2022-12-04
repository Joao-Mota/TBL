package com.aor.lendea.controller.game;

import com.aor.lendea.Game;
import com.aor.lendea.gui.GUI;
import com.aor.lendea.model.Position;
import com.aor.lendea.model.layout.arena.Arena;
import com.aor.lendea.model.layout.elements.LendeaShot;

public class LendeaController extends GameController {
    private long lastMovement;
    public LendeaController(Arena arena) {
        super(arena);
        this.lastMovement = 0;
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

    private void fireUP() {
        getModel().update(new LendeaShot(getModel().getLendea().getPosition().getX(), getModel().getLendea().getPosition().getY() - 1, true, false, false, false));
    }
    private void fireRight() {
        getModel().update(new LendeaShot(getModel().getLendea().getPosition().getX() + 1, getModel().getLendea().getPosition().getY(), false, true, false, false));
    }
    private void fireDown() {
        getModel().update(new LendeaShot(getModel().getLendea().getPosition().getX(), getModel().getLendea().getPosition().getY() + 1, false, false, true, false));
    }
    private void fireLeft() {
        getModel().update(new LendeaShot(getModel().getLendea().getPosition().getX() - 1, getModel().getLendea().getPosition().getY(), false, false, false, true));
    }

    @Override
    public void step(Game game, GUI.ACTION action, long time) {
        if (action == GUI.ACTION.UP) moveLendeaUp();
        if (action == GUI.ACTION.RIGHT) moveLendeaRight();
        if (action == GUI.ACTION.DOWN) moveLendeaDown();
        if (action == GUI.ACTION.LEFT) moveLendeaLeft();
        if (time - lastMovement > 10) {
            if (action == GUI.ACTION.FIRE_UP) fireUP();
            if (action == GUI.ACTION.FIRE_RIGHT) fireRight();
            if (action == GUI.ACTION.FIRE_DOWN) fireDown();
            if (action == GUI.ACTION.FIRE_LEFT) fireLeft();
            this.lastMovement = time;
        }
    }
}
