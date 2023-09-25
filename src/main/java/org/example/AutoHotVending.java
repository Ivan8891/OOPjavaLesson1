package org.example;

import java.util.ArrayList;
import java.util.List;

public class AutoHotVending implements AutoHotDrink{
    private List<HotTemp> drink;
    public AutoHotVending(){
        this.drink = new ArrayList<HotTemp>();
    }

    public List getDrink() {
        return drink;
    }

    public void addDrink(HotTemp drink) {
        this.drink.add(drink);
    }
    public void remDrink(HotTemp drink) {
        this.drink.remove(drink);
    }

    public void printInfo(){
        System.out.println(drink.toString());
    }
    @Override
    public void getProduct(String name, int volume, int temperature){
        for (int i = 0; i < drink.size(); i++) {
            if (drink.get(i).getName().equals(name) && (drink.get(i).getVolume() == volume) && (drink.get(i).getTemp() == temperature)) {
                System.out.println(drink.get(i));
            }
        }
    }
    @Override
    public void getProduct(String name, int volume){
        for (int i = 0; i < drink.size(); i++) {
            if (drink.get(i).getName().equals(name) && (drink.get(i).getVolume() == volume)) {
                System.out.println(drink.get(i));
            }
        }
    }
    @Override
    public void getProduct(String name) {
        for (int i = 0; i < drink.size(); i++) {
            if (drink.get(i).getName().equals(name)) {
                System.out.println(drink.get(i));
            }
        }
    }
}
