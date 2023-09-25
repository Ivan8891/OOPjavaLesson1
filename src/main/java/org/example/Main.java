package org.example;


public class Main {
    public static void main(String[] args) {

        AutoHotVending machine = new AutoHotVending();

        HotTemp tie1 = new HotTemp("чай", 1, 70);
        HotTemp tie2 = new HotTemp("чай", 1, 75);
        HotTemp tie3 = new HotTemp("чай", 2, 80);
        HotTemp cofe1 = new HotTemp("кофе", 1, 70);
        HotTemp cofe2 = new HotTemp("кофе", 2, 75);
        HotTemp cofe3 = new HotTemp("кофе", 2, 80);
        HotTemp cocoa1 = new HotTemp("какао", 1, 70);
        HotTemp cocoa2 = new HotTemp("какао", 2, 75);
        HotTemp cocoa3 = new HotTemp("какао", 3, 80);

        machine.addDrink(tie1);
        machine.addDrink(tie2);
        machine.addDrink(tie3);
        machine.addDrink(cofe1);
        machine.addDrink(cofe2);
        machine.addDrink(cofe3);
        machine.addDrink(cocoa1);
        machine.addDrink(cocoa2);
        machine.addDrink(cocoa3);
        machine.printInfo();
        System.out.println("_".repeat(50));

        machine.getProduct("чай");
        System.out.println("_".repeat(50));
        machine.getProduct("кофе", 2);
        System.out.println("_".repeat(50));
        machine.getProduct("какао", 3, 80);
        System.out.println("_".repeat(50));

        machine.remDrink(tie1);
        machine.remDrink(tie2);
        machine.remDrink(cofe3);
        machine.remDrink(cofe1);
        machine.remDrink(cocoa3);
        machine.remDrink(cocoa2);
        machine.printInfo();

    }
}