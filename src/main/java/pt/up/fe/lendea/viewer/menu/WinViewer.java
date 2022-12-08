package pt.up.fe.lendea.viewer.menu;

import pt.up.fe.lendea.gui.GUI;
import pt.up.fe.lendea.model.Position;
import pt.up.fe.lendea.model.menu.Win;
import pt.up.fe.lendea.viewer.Viewer;

public class WinViewer extends Viewer<Win> {
    public WinViewer(Win gameover) {
        super(gameover);
    }

    @Override
    public void drawElements(GUI gui) {
        gui.drawText(new Position(30, 3), "YOU COMPLETED THIS LEVEL!", "#FFA212");

        for (int i = 0; i < getModel().getNumberEntries(); i++)
            gui.drawText(
                    new Position(5, 17 + i),
                    getModel().getEntry(i),
                    getModel().isSelected(i) ? "#FFA212" : "#FFFFFF");
    }
}
