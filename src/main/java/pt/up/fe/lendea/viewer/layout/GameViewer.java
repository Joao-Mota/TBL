package pt.up.fe.lendea.viewer.layout;

import pt.up.fe.lendea.gui.GUI;
import pt.up.fe.lendea.model.Position;
import pt.up.fe.lendea.model.layout.arena.Arena;
import pt.up.fe.lendea.model.layout.elements.Element;
import pt.up.fe.lendea.viewer.Viewer;

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
        drawElements(gui, getModel().getShots(), new ShotViewer());

        gui.drawText(new Position(67, 13), "HP: " + getModel().getLendea().getHealth(), "#FA1616");
        gui.drawText(new Position(67, 15), "Coins: " + getModel().getLendea().getCoins(), "#F6C345");
    }

    private <T extends Element> void drawElements(GUI gui, List<T> elements, ElementViewer<T> viewer) {
        for (T element : elements)
            drawElement(gui, element, viewer);
    }

    private <T extends Element> void drawElement(GUI gui, T element, ElementViewer<T> viewer) {
        viewer.draw(element, gui);
    }
}
