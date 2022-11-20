package com.aor.lendea.model.settings;

import java.util.Arrays;
import java.util.List;

public class Settings {
    private final List<String> entries;
    private int currentEntry = 0;

    public Settings() {
        this.entries = Arrays.asList("Music", "Volume", "Go Back");
    }

    public void nextEntry() {
        currentEntry++;
        if (currentEntry > this.entries.size() - 1)
            currentEntry = 0;
    }

    public void previousEntry() {
        currentEntry--;
        if (currentEntry < 0)
            currentEntry = this.entries.size() - 1;
    }

    public String getEntry(int i) {
        return entries.get(i);
    }

    public boolean isSelected(int i) {
        return currentEntry == i;
    }

    public boolean isSelectedGoBack() {
        return isSelected(2);
    }

    public boolean isSelectedMusic() {
        return isSelected(0);
    }
    public boolean isSelectedVolume() {
        return isSelected(1);
    }

    public int getNumberEntries() {
        return this.entries.size();
    }
}
