package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test
    public void setCurrentChanelTest() {
        Radio radio = new Radio();
        radio.setCurrentChanel(4);
        assertEquals(4, radio.getCurrentChanel());
        radio.setCurrentChanel(10);
        assertEquals(4, radio.getCurrentChanel());
        radio.setCurrentChanel(-1);
        assertEquals(4, radio.getCurrentChanel());
    }

    @Test
    public void increaseCurrentChanelTest() {
        Radio radio = new Radio();
        radio.setCurrentChanel(4);
        radio.nextChanel();
        assertEquals(5, radio.getCurrentChanel());
    }

    @Test
    public void increaseMaxCurrentChanelTest() {
        Radio radio = new Radio();
        radio.setCurrentChanel(9);
        radio.nextChanel();
        assertEquals(0, radio.getCurrentChanel());
    }

    @Test
    public void decreaseCurrentChanelTest() {
        Radio radio = new Radio();
        radio.setCurrentChanel(4);
        radio.prevChanel();
        assertEquals(3, radio.getCurrentChanel());
    }

    @Test
    public void decreaseMinCurrentChanelTest() {
        Radio radio = new Radio();
        radio.setCurrentChanel(0);
        radio.prevChanel();
        assertEquals(9, radio.getCurrentChanel());
    }

    @Test
    public void setCurrentVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(4);
        assertEquals(4, radio.getCurrentVolume());
        radio.setCurrentVolume(11);
        assertEquals(4, radio.getCurrentVolume());
        radio.setCurrentVolume(-1);
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    public void increaseCurrentVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(4);
        radio.increaseVolume();
        assertEquals(5, radio.getCurrentVolume());
    }

    @Test
    public void increaseMaxCurrentVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void decreaseCurrentVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(4);
        radio.decreaseVolume();
        assertEquals(3, radio.getCurrentVolume());
    }

    @Test
    public void decreaseMinCurrentVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}
