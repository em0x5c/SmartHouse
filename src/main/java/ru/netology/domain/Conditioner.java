package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Conditioner {
    private String name;
    private int maxTemperature;
    private int minTemperature;
    private int currentTemperature;
    private boolean on;

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