package com.aor.lendea.viewer.layout;

import com.aor.lendea.gui.GUI;
import com.aor.lendea.model.layout.elements.Element;

public interface ElementViewer<T extends Element> {
    void draw(T element, GUI gui);
}
