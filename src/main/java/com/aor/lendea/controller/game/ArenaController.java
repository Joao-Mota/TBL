package com.aor.lendea.controller.game;

import com.aor.lendea.Game;
import com.aor.lendea.gui.GUI;
import com.aor.lendea.model.gameover.GameOver;
import com.aor.lendea.model.layout.arena.Arena;
import com.aor.lendea.model.win.Win;
import com.aor.lendea.states.GameOverState;
import com.aor.lendea.states.WinState;

import java.io.IOException;

public class ArenaController extends GameController {
    private final LendeaController heroController;
    private final MonsterController monsterController;
    private final ShotController shotController;

    public ArenaController(Arena arena) {
        super(arena);

        this.heroController = new LendeaController(arena);
        this.monsterController = new MonsterController(arena);
        this.shotController = new ShotController(arena);
    }

    public void step(Game game, GUI.ACTION action, long time) throws IOException {
        if (action == GUI.ACTION.QUIT || getModel().getLendea().getHealth() == 0)
            game.setState(new GameOverState(new GameOver()));
        if (getModel().getLendea().getWin()) {
            game.setState(new WinState(new Win()));
        }
        else {
            heroController.step(game, action, time);
            monsterController.step(game, action, time);
            shotController.step(game, action, time);
        }
    }
}
