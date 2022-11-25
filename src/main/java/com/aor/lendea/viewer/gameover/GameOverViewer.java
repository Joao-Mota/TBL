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
        gui.drawText(new Position(3, 5), "  ####                                     ####                            " , "#FFA212");
        gui.drawText(new Position(3, 6), " #######                                  #######                          " , "#FFA212");
        gui.drawText(new Position(3, 7), "####      ######    ##### ###    ###     ###  ###  ##  ###   ###    ####   " , "#FFA212");
        gui.drawText(new Position(3, 8), "###      ######    ##########  ######    ###   ##  ## ###  ######  ######  " , "#FFA212");
        gui.drawText(new Position(3, 9), "##  ###  ### ##    ### ### ##  ##  ##    ##    ##  ## ##   ##  ##  ###     " , "#FFA212");
        gui.drawText(new Position(3, 10), "## ####  ##  ##    ##  ##  ##  ######    ##   ###  #####   ######  ##      " , "#FFA212");
        gui.drawText(new Position(3, 11), "##   ##  ## ###    ##  ##  ##  ###       ### ###   ####    ###     ##      " , "#FFA212");
        gui.drawText(new Position(3, 12), "#######  #######  ### ### ###  #####     #######   ####    #####  ###      " , "#FFA212");
        gui.drawText(new Position(3, 13), " #####   ##### ## ### ### ###   ####      ####     ###      ####  ###      " , "#FFA212");



        for (int i = 0; i < getModel().getNumberEntries(); i++)
            gui.drawText(
                    new Position(55, 40 + i),
                    getModel().getEntry(i),
                    getModel().isSelected(i) ? "#FFA212" : "#FFFFFF");
    }
}
