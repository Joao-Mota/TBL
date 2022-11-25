package com.aor.lendea.viewer.help;

import com.aor.lendea.gui.GUI;
import com.aor.lendea.model.Position;
import com.aor.lendea.model.help.Help;
import com.aor.lendea.viewer.Viewer;

public class HelpViewer extends Viewer<Help> {
    public HelpViewer(Help help) {
        super(help);
    }

    @Override
    public void drawElements(GUI gui) {
        // Title
        gui.drawText(new Position(38, 1), "Help", "#FFA212");

        // Commands
        gui.drawText(new Position(5, 3), "Commands:", "#FFA212");
        gui.drawText(new Position(5, 5), "WASD / Arrow Keys - Move", "#FFFFFF");
        gui.drawText(new Position(5, 6), "SpaceBar - Shoot", "#FFFFFF");
        gui.drawText(new Position(5, 7), "Q - GiveUp", "#FFFFFF");


        gui.drawText(new Position(40, 3), "|", "#FFFFFF");
        gui.drawText(new Position(40, 4), "|", "#FFFFFF");
        gui.drawText(new Position(40, 5), "|", "#FFFFFF");
        gui.drawText(new Position(40, 6), "|", "#FFFFFF");
        gui.drawText(new Position(40, 7), "|", "#FFFFFF");

        // Elements
        gui.drawText(new Position(43, 3), "Elements:", "#FFA212");
        gui.drawText(new Position(43, 5), "Player - *   | Shots - -", "#FFFFFF");
        gui.drawText(new Position(43, 6), "Enemy  - @   | Walls - #", "#FFFFFF");
        gui.drawText(new Position(43, 7), "Coin   - $   |          ", "#FFFFFF");



        gui.drawText(new Position(5, 8), "________________________________________________________________________", "#FFFFFF");

        // Info
        gui.drawText(new Position(5, 9), "Info:", "#FFA212");
        gui.drawText(new Position(5, 11), "You are a Lendea, a mythical creature", "#FFFFFF");
        gui.drawText(new Position(5, 12), "that rides a pao de forma", "#FFFFFF");
        gui.drawText(new Position(5, 13), "and shoots bread to defend itself", "#FFFFFF");
        gui.drawText(new Position(5, 14), "from the evil forces of the world.", "#FFFFFF");

        for (int i = 0; i < getModel().getNumberEntries(); i++)
            gui.drawText(
                    new Position(55, 17 + i),
                    getModel().getEntry(i),
                    getModel().isSelected(i) ? "#FFA212" : "#FFFFFF");
    }
}
