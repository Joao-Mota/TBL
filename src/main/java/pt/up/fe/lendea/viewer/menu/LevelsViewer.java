package pt.up.fe.lendea.viewer.menu;

import pt.up.fe.lendea.gui.GUI;
import pt.up.fe.lendea.model.Position;
import pt.up.fe.lendea.model.menu.Levels;
import pt.up.fe.lendea.viewer.Viewer;

public class LevelsViewer extends Viewer<Levels> {
    public LevelsViewer(Levels levels) {
        super(levels);
    }

    @Override
    public void drawElements(GUI gui) {
        gui.drawText(new Position(35, 3), "Levels", "#FFA212");

        for (int i = 0; i < getModel().getNumberEntries(); i++) {
            gui.drawText(
                    new Position(5, 13 + i),
                    getModel().getEntry(i),
                    getModel().isSelected(i) ? "#FFA212" : "#FFFFFF");
        }
    }
}
