package com.aor.lendea.viewer.layout;

import com.aor.lendea.gui.GUI;
import com.aor.lendea.model.Position;
import com.aor.lendea.model.layout.arena.Arena;
import com.aor.lendea.model.layout.elements.Element;
import com.aor.lendea.viewer.Viewer;

import java.util.List;

public class GameViewer extends Viewer<Arena> {
    public GameViewer(Arena arena) {
        super(arena);
    }

    @Override
    public void drawElements(GUI gui) {
        drawElements(gui, getModel().getWalls(), new WallViewer());
        drawElements(gui, getModel().getMonsters(), new MonsterViewer());
        drawElements(gui, getModel().getCoins(), new CoinViewer());
        drawElement(gui, getModel().getLendea(), new LendeaViewer());

        gui.drawText(new Position(0, 0), "HP: " + getModel().getLendea().getHealth(), "#FA1616");
        gui.drawText(new Position(10, 0), "SP: " + getModel().getLendea().getStrike(), "#2AD3FF");
        gui.drawText(new Position(20, 0), "DP: " + getModel().getLendea().getDefense(), "#75FF7E");
        gui.drawText(new Position(20, 0), "Coins: " + getModel().getLendea().getCoins(), "#F6C345");
    }

    private <T extends Element> void drawElements(GUI gui, List<T> elements, ElementViewer<T> viewer) {
        for (T element : elements)
            drawElement(gui, element, viewer);
    }

    private <T extends Element> void drawElement(GUI gui, T element, ElementViewer<T> viewer) {
        viewer.draw(element, gui);
    }
}