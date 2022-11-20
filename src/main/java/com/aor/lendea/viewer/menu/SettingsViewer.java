package com.aor.lendea.viewer.menu;

import com.aor.lendea.gui.GUI;
import com.aor.lendea.model.Position;
import com.aor.lendea.model.settings.Settings;
import com.aor.lendea.viewer.Viewer;

public class SettingsViewer extends Viewer<Settings> {
    public SettingsViewer(Settings settings) {
        super(settings);
    }

    @Override
    public void drawElements(GUI gui) {
        gui.drawText(new Position(5, 5), "Settings", "#FFFFFF");

        for (int i = 0; i < getModel().getNumberEntries(); i++)
            gui.drawText(
                    new Position(5, 7 + i),
                    getModel().getEntry(i),
                    getModel().isSelected(i) ? "#FFD700" : "#FFFFFF");
    }
}
