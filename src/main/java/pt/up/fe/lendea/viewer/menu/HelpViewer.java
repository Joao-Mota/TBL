package pt.up.fe.lendea.viewer.menu;

import pt.up.fe.lendea.gui.GUI;
import pt.up.fe.lendea.model.Position;
import pt.up.fe.lendea.model.menu.Help;
import pt.up.fe.lendea.viewer.Viewer;

public class HelpViewer extends Viewer<Help> {
    public HelpViewer(Help help) {
        super(help);
    }

    @Override
    public void drawElements(GUI gui) {
        // Title
        gui.drawText(new Position(28, 3), "##  ## ##### ##    #####", "#FFA212");
        gui.drawText(new Position(28, 4), "##  ## ##    ##    ## ##", "#FFA212");
        gui.drawText(new Position(28, 5), "###### ####  ##    #####", "#FFA212");
        gui.drawText(new Position(28, 6), "##  ## ##    ##    ##   ", "#FFA212");
        gui.drawText(new Position(28, 7), "##  ## ##### ##### ##   ", "#FFA212");

        // Commands
        gui.drawText(new Position(5, 11), "Commands:", "#FFA212");
        gui.drawText(new Position(5, 14), "   WASD     - Move", "#FFFFFF");
        gui.drawText(new Position(5, 15), "Arrow keys  - Shoot", "#FFFFFF");
        gui.drawText(new Position(5, 16), "     Q      - Give Up", "#FFFFFF");



        gui.drawText(new Position(40, 10), "|", "#FFFFFF");
        gui.drawText(new Position(40, 11), "|", "#FFFFFF");
        gui.drawText(new Position(40, 12), "|", "#FFFFFF");
        gui.drawText(new Position(40, 13), "|", "#FFFFFF");
        gui.drawText(new Position(40, 14), "|", "#FFFFFF");
        gui.drawText(new Position(40, 15), "|", "#FFFFFF");
        gui.drawText(new Position(40, 16), "|", "#FFFFFF");
        gui.drawText(new Position(40, 17), "|", "#FFFFFF");

        // Elements
        gui.drawText(new Position(43, 11), "Elements:", "#FFA212");
        gui.drawText(new Position(43, 14), " Player  - *        | Shots - o", "#FFFFFF");
        gui.drawText(new Position(43, 15), "Enemies  - @ / B    | Walls - #", "#FFFFFF");
        gui.drawText(new Position(43, 16), "  Coin   - $        |          ", "#FFFFFF");



        gui.drawText(new Position(5, 18), "________________________________________________________________________", "#FFFFFF");

        // Info
        gui.drawText(new Position(5, 21), "Info:", "#FFA212");
        gui.drawText(new Position(5, 24), "You are a Lendea, a mythical creature", "#FFFFFF");
        gui.drawText(new Position(5, 25), "that rides a pao de forma", "#FFFFFF");
        gui.drawText(new Position(5, 26), "and shoots bread to defend itself", "#FFFFFF");
        gui.drawText(new Position(5, 27), "from the evil forces of the world.", "#FFFFFF");
        gui.drawText(new Position(5, 28), "You must collect coins to buy bread", "#FFFFFF");
        gui.drawText(new Position(5, 29), "and defeat the enemies.", "#FFFFFF");
        gui.drawText(new Position(5, 30), "Good luck!", "#FFFFFF");


        for (int i = 0; i < getModel().getNumberEntries(); i++)
            gui.drawText(
                    new Position(55, 40 + i),
                    getModel().getEntry(i),
                    getModel().isSelected(i) ? "#FFA212" : "#FFFFFF");
    }
}
