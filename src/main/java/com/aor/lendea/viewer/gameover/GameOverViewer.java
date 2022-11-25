package com.aor.lendea.viewer.gameover;

import com.aor.lendea.gui.GUI;
import com.aor.lendea.model.Position;
import com.aor.lendea.model.gameover.GameOver;
import com.aor.lendea.viewer.Viewer;

public class GameOverViewer extends Viewer<GameOver> {
    public GameOverViewer(GameOver gameover) {
        super(gameover);
    }

    @Override
    public void drawElements(GUI gui) {


        // Game Over Screen Text
        gui.drawText(new Position(4, 1), "  ####                                     ####                            " , "#FFA212");
        gui.drawText(new Position(4, 2), " #######                                  #######                          " , "#FFA212");
        gui.drawText(new Position(4, 3), "####      ######    ##### ###    ###     ###  ###  ##  ###   ###    ####   " , "#FFA212");
        gui.drawText(new Position(4, 4), "###      ######    ##########  ######    ###   ##  ## ###  ######  ######  " , "#FFA212");
        gui.drawText(new Position(4, 5), "##  ###  ### ##    ### ### ##  ##  ##    ##    ##  ## ##   ##  ##  ###     " , "#FFA212");
        gui.drawText(new Position(4, 6), "## ####  ##  ##    ##  ##  ##  ######    ##   ###  #####   ######  ##      " , "#FFA212");
        gui.drawText(new Position(4, 7), "##   ##  ## ###    ##  ##  ##  ###       ### ###   ####    ###     ##      " , "#FFA212");
        gui.drawText(new Position(4, 8), "#######  #######  ### ### ###  #####     #######   ####    #####  ###      " , "#FFA212");
        gui.drawText(new Position(4, 9), " #####   ##### ## ### ### ###   ####      ####     ###      ####  ###      " , "#FFA212");



        for (int i = 0; i < getModel().getNumberEntries(); i++)
            gui.drawText(
                    new Position(55, 17 + i),
                    getModel().getEntry(i),
                    getModel().isSelected(i) ? "#FFA212" : "#FFFFFF");
    }
}
