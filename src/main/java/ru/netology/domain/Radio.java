package ru.netology.domain;

public class Radio {
    private final static int minChannel = 0;
    private final static int maxChannel = 9;
    private int currentChannel = minChannel;

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

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel < minChannel) {
            return;
        }
        if (currentChannel > maxChannel) {
            return;
        }

        this.currentChannel = currentChannel;
    }

    public void nextChannel() {
        if (currentChannel == maxChannel) {
            currentChannel = minChannel;
        }
        else {
            currentChannel++;
        }
    }

    public void prevChannel() {
        if (currentChannel == minChannel) {
            currentChannel = maxChannel;
        }
        else {
            currentChannel--;
        }
    }
}
