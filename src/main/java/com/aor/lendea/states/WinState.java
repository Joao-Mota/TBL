package com.aor.lendea.states;

import com.aor.lendea.controller.Controller;
import com.aor.lendea.controller.menu.WinController;
import com.aor.lendea.model.win.Win;
import com.aor.lendea.viewer.Viewer;
import com.aor.lendea.viewer.win.WinViewer;

public class WinState extends State<Win> {
    public WinState(Win win) {
        super(win);
    }

    @Override
    protected Viewer<Win> getViewer() {return new WinViewer(getModel());}

    @Override
    protected Controller<Win> getController() {
        return new WinController(getModel());
    }
}
