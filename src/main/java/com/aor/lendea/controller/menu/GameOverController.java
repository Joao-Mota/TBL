package com.aor.lendea.controller.menu;

import com.aor.lendea.Game;
import com.aor.lendea.controller.Controller;
import com.aor.lendea.gui.GUI;
import com.aor.lendea.model.gameover.GameOver;
import com.aor.lendea.model.menu.Menu;
import com.aor.lendea.states.MenuState;

import java.io.IOException;

public class GameOverController extends Controller<GameOver> {
    public GameOverController(GameOver gameover) {
        super(gameover);
    }

    @Override
    public void step(Game game, GUI.ACTION action, long time) throws IOException {
        switch (action) {
            case UP:
                getModel().previousEntry();
                break;
            case DOWN:
                getModel().nextEntry();
                break;
            case SELECT:
                if (getModel().isSelectedGoBack()) game.setState(new MenuState(new Menu()));
        }
    }
}
