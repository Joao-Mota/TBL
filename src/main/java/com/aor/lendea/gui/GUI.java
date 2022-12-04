package com.aor.lendea.gui;

import com.aor.lendea.model.Position;

import java.io.IOException;

public interface GUI {
    ACTION getNextAction() throws IOException;

    void drawLendea(Position position);

    void drawWall(Position position);

    void drawMonster(Position position);

    void drawCoin(Position position);

    void drawShot(Position position);

    void drawText(Position position, String text, String color);

    void clear();

    void refresh() throws IOException;

    void close() throws IOException;

    enum ACTION {UP, RIGHT, DOWN, LEFT, NONE, QUIT, SELECT, FIRE_UP, FIRE_RIGHT, FIRE_DOWN, FIRE_LEFT}
}
