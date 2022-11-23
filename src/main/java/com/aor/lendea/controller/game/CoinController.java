package com.aor.lendea.controller.game;

import com.aor.lendea.Game;
import com.aor.lendea.gui.GUI;
import com.aor.lendea.model.Position;
import com.aor.lendea.model.layout.arena.Arena;
import com.aor.lendea.model.layout.elements.Coin;

import java.io.IOException;

public class CoinController extends GameController {
    private long lastMovement;

    public CoinController(Arena arena) {
        super(arena);

        this.lastMovement = 0;
    }

    @Override
    public void step(Game game, GUI.ACTION action, long time) throws IOException {
        if (time - lastMovement > 500) {
            for (Coin coin : getModel().getCoins())
                moveCoin(coin, coin.getPosition().getRandomNeighbour());
            this.lastMovement = time;
        }
    }

    private void moveCoin(Coin coin, Position position) {
        if (getModel().isEmpty(position)) {
            coin.setPosition(position);
            if (getModel().getLendea().getPosition().equals(position))
                getModel().getLendea().incrementCoins();
        }
    }
}
