package com.aor.lendea.states;

import com.aor.lendea.controller.Controller;
import com.aor.lendea.controller.menu.SettingsController;
import com.aor.lendea.model.settings.Settings;
import com.aor.lendea.viewer.Viewer;
import com.aor.lendea.viewer.settings.SettingsViewer;

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
