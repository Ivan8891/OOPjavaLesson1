package org.example;

import java.util.ArrayList;

public class HotTemp extends HotDrink {
    private int temperature;

    public HotTemp(String name, int volume, int temperature){
        super(name, volume);
        this.temperature=temperature;
    }

    public int getTemp() {
        return temperature;
    }

    public void setTemp(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "{" +
                "Название - " + name +
                "\t| Объем - " + volume +
                "\t| Температура - " + temperature +
                "}\n";
    }
}
