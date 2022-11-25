package com.aor.lendea.viewer.layout;

import com.aor.lendea.gui.GUI;
import com.aor.lendea.model.layout.elements.Lendea;

public class LendeaViewer implements ElementViewer<Lendea> {
    @Override
    public void draw(Lendea lendea, GUI gui) {
        gui.drawLendea(lendea.getPosition());
    }
}
