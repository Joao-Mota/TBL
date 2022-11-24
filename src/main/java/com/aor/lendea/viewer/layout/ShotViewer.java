package com.aor.lendea.viewer.layout;

import com.aor.lendea.gui.GUI;
import com.aor.lendea.model.layout.elements.Shot;

public class ShotViewer implements ElementViewer<Shot> {
    @Override
    public void draw(Shot shot, GUI gui) {
        gui.drawShot(shot.getPosition());
    }
}
