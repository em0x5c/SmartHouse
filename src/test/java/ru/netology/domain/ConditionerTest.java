package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
    /**
     * Тестирует, что increaseCurrentTemperature увеличивает температуру на 1
     */
    @Test
    public void increaseCurrentTemperatureTest(){
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(12);

        assertEquals(0, conditioner.getCurrentTemperature());
        conditioner.setCurrentTemperature(22);
        assertEquals(22, conditioner.getCurrentTemperature());

        conditioner.increaseCurrentTemperature();
        assertEquals(23, conditioner.getCurrentTemperature());
    }

    /**
     * Тестирует, что increaseCurrentTemperature не увеличивает температуру при достижении максимального значения
     */
    @Test
    public void increaseMaxCurrentTemperatureTest(){
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(12);

        assertEquals(0, conditioner.getCurrentTemperature());
        conditioner.setCurrentTemperature(25);
        assertEquals(25, conditioner.getCurrentTemperature());

        conditioner.increaseCurrentTemperature();
        assertEquals(25, conditioner.getCurrentTemperature());
    }

    /**
     * Тестирует, что decreaseCurrentTemperature уменьшает температуру на 1
     */
    @Test
    public void decreaseCurrentTemperatureTest(){
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(12);

        assertEquals(0, conditioner.getCurrentTemperature());
        conditioner.setCurrentTemperature(22);
        assertEquals(22, conditioner.getCurrentTemperature());

        conditioner.decreaseCurrentTemperature();
        assertEquals(21, conditioner.getCurrentTemperature());
    }

    /**
     * Тестирует, что decreaseCurrentTemperature не уменьшает температуру при достижении минимального значения
     */
    @Test
    public void decreaseMinCurrentTemperatureTest(){
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(25);
        conditioner.setMinTemperature(12);

        assertEquals(0, conditioner.getCurrentTemperature());
        conditioner.setCurrentTemperature(12);
        assertEquals(12, conditioner.getCurrentTemperature());

        conditioner.decreaseCurrentTemperature();
        assertEquals(12, conditioner.getCurrentTemperature());
    }
}