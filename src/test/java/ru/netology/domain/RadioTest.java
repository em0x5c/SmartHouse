package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    /**
     * Тестирует корректность установки текущего канала,
     * а также отсутствие возможности установки ниже минимума (0) и выше максимума (9).
     */
    @Test
    public void setCurrentChannelTest() {
        Radio radio = new Radio();
        radio.setCurrentChannel(4);
        assertEquals(4, radio.getCurrentChannel());
        radio.setCurrentChannel(10);
        assertEquals(4, radio.getCurrentChannel());
        radio.setCurrentChannel(-1);
        assertEquals(4, radio.getCurrentChannel());
    }

    /**
     * Тестирует корректность работы метода {@link Radio#nextChannel()}
     * для значений из интервала [minChannel, maxChannel).
     */
    @Test
    public void increaseCurrentChannelTest() {
        Radio radio = new Radio();
        radio.setCurrentChannel(4);
        radio.nextChannel();
        assertEquals(5, radio.getCurrentChannel());
    }

    /**
     * Тестирует корректность переключения текущей станции с помощью метода {@link Radio#nextChannel()}
     * на значение minChannel, если текущее значение равно maxChannel.
     */
    @Test
    public void shouldSwitchToMinChannelWhenCurrentChannelIsMaxTest() {
        Radio radio = new Radio();
        radio.setCurrentChannel(9);
        radio.nextChannel();
        assertEquals(0, radio.getCurrentChannel());
    }

    /**
     * Тестирует корректность работы метода {@link Radio#prevChannel()}
     * для значений из интервала (minChannel, maxChannel].
     */
    @Test
    public void decreaseCurrentChannelTest() {
        Radio radio = new Radio();
        radio.setCurrentChannel(4);
        radio.prevChannel();
        assertEquals(3, radio.getCurrentChannel());
    }

    /**
     * Тестирует корректность переключения текущей станции с помощью метода {@link Radio#prevChannel()}
     * на значение maxChannel, если текущее значение равно minChannel.
     */
    @Test
    public void shouldSwitchToMaxChannelWhenCurrentChannelIsMinTest() {
        Radio radio = new Radio();
        radio.setCurrentChannel(0);
        radio.prevChannel();
        assertEquals(9, radio.getCurrentChannel());
    }

    /**
     * Тестирует корректность установки текущего уровня громкоти звука,
     * а также отсутствие возможности установки ниже минимума (0) и выше максимума (10).
     */
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

    /**
     * Тестирует корректность работы метода {@link Radio#increaseVolume()}
     * для значений из интервала [minVolume, maxVilume).
     */
    @Test
    public void increaseCurrentVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(4);
        radio.increaseVolume();
        assertEquals(5, radio.getCurrentVolume());
    }

    /**
     * Тестирует, что при попытке увеличить максимальное значение,
     * значение остается прежнем
     */
    @Test
    public void shouldNotExceedMaxVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    /**
     * Тестирует корректность работы метода {@link Radio#decreaseVolume()}
     * для значений из интервала (minVolume, maxVilume].
     */
    @Test
    public void decreaseCurrentVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(4);
        radio.decreaseVolume();
        assertEquals(3, radio.getCurrentVolume());
    }

    /**
     * Тестирует, что при попытке уменьшить минимальное значение,
     * значение остается прежнем
     */
    @Test
    public void shouldNotLowerMinVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
}
