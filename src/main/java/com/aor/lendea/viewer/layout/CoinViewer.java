package com.aor.lendea.viewer.layout;

import com.aor.lendea.gui.GUI;
import com.aor.lendea.model.layout.elements.Coin;

public class CoinViewer implements ElementViewer<Coin> {
    @Override
    public void draw(Coin coin, GUI gui) {
        gui.drawCoin(coin.getPosition());
    }
}
