package com.aor.lendea.states;

import com.aor.lendea.controller.Controller;
import com.aor.lendea.controller.menu.MenuController;
import com.aor.lendea.model.menu.Menu;
import com.aor.lendea.viewer.Viewer;
import com.aor.lendea.viewer.menu.MenuViewer;

public class MenuState extends State<Menu> {
    public MenuState(Menu menu) {
        super(menu);
    }

    @Override
    protected Viewer<Menu> getViewer() {
        return new MenuViewer(getModel());
    }

    @Override
    protected Controller<Menu> getController() {
        return new MenuController(getModel());
    }
}
