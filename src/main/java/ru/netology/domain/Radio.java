package ru.netology.domain;

public class Radio {
    private final static int minChannel = 0;
    private final int maxChannel;
    private int currentChannel = minChannel;

    private final static int minVolume = 0;
    private final static int maxVolume = 100;
    private int currentVolume = minVolume;

    /**
     * Создает новый экземпляр класса Radio с максимальным количеством радиостанций,
     * определяемых параметром maxChannel.
     * Радиостанции нумеруются от 0 до maxChannel - 1.
     * Уровень звука по умолчанию равен 0.
     *
     * @param maxChannel Максимальное количество радиостанций.
     */
    public Radio(int maxChannel) {
        this.maxChannel = maxChannel;
    }

    /**
     * Создает новый экземпляр класса Radio с максимальным количеством радиостанций,
     * по умолчанию равным 10.
     * Радиостанции нумеруются от 0 до 9.
     * Уровень звука по умолчанию равен 0.
     */
    public Radio() {
       this.maxChannel = 10;
    }

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
