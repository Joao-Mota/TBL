package pt.up.fe.lendea.controller.menu;

import pt.up.fe.lendea.Game;
import pt.up.fe.lendea.controller.Controller;
import pt.up.fe.lendea.gui.GUI;
import pt.up.fe.lendea.model.menu.Menu;
import pt.up.fe.lendea.model.menu.Settings;
import pt.up.fe.lendea.states.MenuState;

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
