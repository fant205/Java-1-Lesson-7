package ru.gb.lesson7;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
        if (food - n < 0) {
            System.out.printf("В тарелке нет нужного количества еды. food: %s, n: %s;%n", food, n);
            return false;
        }
        food -= n;
        return true;
    }

    public void info() {
        System.out.println("Еды в тарелке: " + food);
    }

    public boolean isMuchFood(int n) {
        if (food > n) {
            return true;
        }
        System.out.printf("В тарелке мало еды! food: %s, n: %s;%n", food, n);
        return false;
    }

    public void addFood(int n){
        food += n;
    }

}