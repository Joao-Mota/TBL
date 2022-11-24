package com.aor.lendea.states;

import com.aor.lendea.controller.Controller;
import com.aor.lendea.controller.menu.GameOverController;
import com.aor.lendea.model.gameover.GameOver;
import com.aor.lendea.viewer.Viewer;
import com.aor.lendea.viewer.gameover.GameOverViewer;

public class GameOverState extends State<GameOver> {
    public GameOverState(GameOver gameover) {
        super(gameover);
    }

    @Override
    protected Viewer<GameOver> getViewer() {return new GameOverViewer(getModel());}

    @Override
    protected Controller<GameOver> getController() {
        return new GameOverController(getModel());
    }
}
