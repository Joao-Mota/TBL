package com.aor.lendea.controller.game;

import com.aor.lendea.Game;
import com.aor.lendea.gui.GUI;
import com.aor.lendea.model.layout.arena.Arena;
import com.aor.lendea.model.menu.Menu;
import com.aor.lendea.states.MenuState;

import java.io.IOException;

public class ArenaController extends GameController {
    private final HeroController heroController;
    private final MonsterController monsterController;
    private final CoinController coinController;

    public ArenaController(Arena arena) {
        super(arena);

        this.heroController = new HeroController(arena);
        this.monsterController = new MonsterController(arena);
        this.coinController = new CoinController(arena);
    }

    public void step(Game game, GUI.ACTION action, long time) throws IOException {
        if (action == GUI.ACTION.QUIT || getModel().getLendea().getHealth() == 0)
            game.setState(new MenuState(new Menu()));
        else {
            heroController.step(game, action, time);
            monsterController.step(game, action, time);
            coinController.step(game, action, time);
        }
    }
}