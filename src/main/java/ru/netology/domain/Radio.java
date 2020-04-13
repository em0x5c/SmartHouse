package ru.netology.domain;

public class Radio {
    private final static int minChanel = 0;
    private final static int maxChanel = 9;
    private int currentChanel = minChanel;

    private final static int minVolume = 0;
    private final static int maxVolume = 10;
    private int currentVolume = minVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume != maxVolume) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume != minVolume) {
            currentVolume--;
        }
    }

    public int getCurrentChanel() {
        return currentChanel;
    }

    public void setCurrentChanel(int currentChanel) {
        if (currentChanel < minChanel) {
            return;
        }
        if (currentChanel > maxChanel) {
            return;
        }

        this.currentChanel = currentChanel;
    }

    public void nextChanel() {
        if (currentChanel == maxChanel) {
            currentChanel = minChanel;
        }
        else {
            currentChanel++;
        }
    }

    public void prevChanel() {
        if (currentChanel == minChanel) {
            currentChanel = maxChanel;
        }
        else {
            currentChanel--;
        }
    }
}
