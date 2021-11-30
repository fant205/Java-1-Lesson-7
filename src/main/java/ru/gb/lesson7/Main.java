package ru.gb.lesson7;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 1);
        Plate plate = new Plate(10);
        plate.info();
        cat.eat(plate);
        plate.info();

        // cats array

        Cat[] cats = new Cat[7];
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat("Cat " + (i + 1), i + 1);
            cats[i].eat(plate);
            plate.info();
        }

        plate.addFood(5);
        plate.info();
    }
}
