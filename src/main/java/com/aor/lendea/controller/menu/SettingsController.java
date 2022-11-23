package com.aor.lendea.controller.menu;

import com.aor.lendea.Game;
import com.aor.lendea.controller.Controller;
import com.aor.lendea.gui.GUI;
import com.aor.lendea.model.menu.Menu;
import com.aor.lendea.model.settings.Settings;
import com.aor.lendea.states.MenuState;

import java.io.IOException;

public class SettingsController extends Controller<Settings> {
    public SettingsController(Settings settings) {
        super(settings);
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
                if (getModel().isSelectedMusic()) game.setState(null);
        }
    }
}