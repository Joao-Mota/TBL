package com.aor.lendea.viewer.menu;

import com.aor.lendea.gui.GUI;
import com.aor.lendea.model.Position;
import com.aor.lendea.model.menu.Menu;
import com.aor.lendea.viewer.Viewer;

public class MenuViewer extends Viewer<Menu> {
    public MenuViewer(Menu menu) {
        super(menu);
    }

    @Override
    public void drawElements(GUI gui) {
        gui.drawText(new Position(31, 3), "The Binding of Lendea", "#FFA212");

        for (int i = 0; i < getModel().getNumberEntries(); i++) {
            gui.drawText(
                    new Position(5, 8 + i),
                    getModel().getEntry(i),
                    getModel().isSelected(i) ? "#FFA212" : "#FFFFFF");
        }
    }
}
