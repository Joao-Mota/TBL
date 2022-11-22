package com.aor.lendea.controller.menu;

import com.aor.lendea.Game;
import com.aor.lendea.controller.Controller;
import com.aor.lendea.gui.GUI;
import com.aor.lendea.model.help.Help;
import com.aor.lendea.model.layout.arena.LoaderArenaBuilder;
import com.aor.lendea.model.menu.Menu;
import com.aor.lendea.model.settings.Settings;
import com.aor.lendea.states.GameState;
import com.aor.lendea.states.HelpState;
import com.aor.lendea.states.SettingsState;

import java.io.IOException;

public class MenuController extends Controller<Menu> {
    public MenuController(Menu menu) {
        super(menu);
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
                if (getModel().isSelectedExit()) game.setState(null);
                if (getModel().isSelectedSettings()) game.setState(new SettingsState(new Settings()));
                if (getModel().isSelectedHelp()) game.setState(new HelpState(new Help()));
                if (getModel().isSelectedPlay()) game.setState(new GameState(new LoaderArenaBuilder(1).createArena()));
        }
    }
}
