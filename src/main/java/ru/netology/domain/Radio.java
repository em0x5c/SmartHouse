package ru.netology.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Radio {
    private final static int minChannel = 0;
    private int maxChannel = 10;
    private int currentChannel = minChannel;

    private final static int minVolume = 0;
    private final static int maxVolume = 100;
    private int currentVolume = minVolume;

    public Radio(int maxChannel) {
        this.maxChannel = maxChannel;
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

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel < minChannel) {
            return;
        }
        if (currentChannel >= maxChannel) {
            return;
        }

        this.currentChannel = currentChannel;
    }

    public void nextChannel() {
        if (currentChannel == maxChannel - 1) {
            currentChannel = minChannel;
        }
        else {
            currentChannel++;
        }
    }

    public void prevChannel() {
        if (currentChannel == minChannel) {
            currentChannel = maxChannel - 1;
        }
        else {
            currentChannel--;
        }
    }
}
