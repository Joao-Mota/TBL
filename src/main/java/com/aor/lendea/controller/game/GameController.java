package com.aor.lendea.controller.game;

import com.aor.lendea.controller.Controller;
import com.aor.lendea.model.layout.arena.Arena;

public abstract class GameController extends Controller<Arena> {
    public GameController(Arena arena) {
        super(arena);
    }
}
