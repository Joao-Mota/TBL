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
        gui.drawText(new Position(35, 3), "GAME OVER", "#FFA212");

        for (int i = 0; i < getModel().getNumberEntries(); i++)
            gui.drawText(
                    new Position(5, 13 + i),
                    getModel().getEntry(i),
                    getModel().isSelected(i) ? "#FFA212" : "#FFFFFF");
    }
}
