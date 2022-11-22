package com.aor.lendea.states;

import com.aor.lendea.controller.Controller;
import com.aor.lendea.controller.menu.HelpController;
import com.aor.lendea.model.help.Help;
import com.aor.lendea.viewer.Viewer;
import com.aor.lendea.viewer.help.HelpViewer;

public class HelpState extends State<Help> {
    public HelpState(Help help) {
        super(help);
    }

    @Override
    protected Viewer<Help> getViewer() {return new HelpViewer(getModel());}

    @Override
    protected Controller<Help> getController() {
        return new HelpController(getModel());
    }
}
