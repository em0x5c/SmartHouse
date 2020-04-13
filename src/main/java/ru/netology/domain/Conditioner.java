package ru.netology.domain;

public class Conditioner {
        private String name;
        private int maxTemperature;
        private int minTemperature;
        private int currentTemperature;
        private boolean on;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {
        if (currentTemperature > maxTemperature){
            return;
        }
        if (currentTemperature < minTemperature){
            return;
        }
        this.currentTemperature = currentTemperature;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    /**
     * увеличивает температуру на 1 до тех пор, пока не достигнута максимальная
     * после достижения maxTemperature не увеличивает значение
     */
    public void increaseCurrentTemperature() {
        if (currentTemperature >= maxTemperature) {
            return;
        }

        currentTemperature++;
    }

    /**
     * уменьшает температуру на 1 до тех пор, пока не достигнута минимальная
     * после достижения minTemperature не уменьшает значение
     */
    public void decreaseCurrentTemperature() {
        if (currentTemperature <= minTemperature) {
            return;
        }

        currentTemperature--;
    }
}