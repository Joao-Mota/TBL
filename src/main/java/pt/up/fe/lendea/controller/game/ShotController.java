package pt.up.fe.lendea.controller.game;

import pt.up.fe.lendea.Game;
import pt.up.fe.lendea.gui.GUI;
import pt.up.fe.lendea.model.Position;
import pt.up.fe.lendea.model.layout.arena.Arena;
import pt.up.fe.lendea.model.layout.elements.Shot;

import java.io.IOException;

public class ShotController extends GameController{
    private final long lastMovement;
    private boolean flag = false;

    public ShotController(Arena arena) {
        super(arena);
        this.lastMovement = 0;
    }

    @Override
    public void step(Game game, GUI.ACTION action, long time) throws IOException {
        for (Shot shot : getModel().getShots()) {
            if(shot.getDirectionUp()) {moveShot(shot, shot.getPosition().movingShotUp());
                if(flag) {flag = false; break;}
            }
            if(shot.getDirectionRight()) {moveShot(shot, shot.getPosition().movingShotRight());
                if(flag) {flag = false; break;}
            }
            if(shot.getDirectionDown()) {moveShot(shot, shot.getPosition().movingShotDown());
                if(flag) {flag = false; break;}
            }
            if(shot.getDirectionLeft()) {moveShot(shot, shot.getPosition().movingShotLeft());
                if(flag) {flag = false; break;}
            }
        }
    }

    private void moveShot(Shot shot, Position position) {
        if (getModel().isNotWall(position)) {
            shot.setPosition(position);
        }
        getModel().removeMonster(shot);
        if(!getModel().isNotWall(position)) {
            getModel().removeShot(shot);
            flag = true;
        }
    }
}
