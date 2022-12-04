package pt.up.fe.lendea.states;

import pt.up.fe.lendea.controller.Controller;
import pt.up.fe.lendea.controller.menu.SettingsController;
import pt.up.fe.lendea.model.menu.Settings;
import pt.up.fe.lendea.viewer.Viewer;
import pt.up.fe.lendea.viewer.menu.SettingsViewer;

public class SettingsState extends State<Settings> {
    public SettingsState(Settings settings) {
        super(settings);
    }

    @Override
    protected Viewer<Settings> getViewer() {return new SettingsViewer(getModel());}

    @Override
    protected Controller<Settings> getController() {
        return new SettingsController(getModel());
    }
}
