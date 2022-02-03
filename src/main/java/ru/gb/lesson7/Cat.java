package ru.gb.lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        if (!p.isMuchFood(appetite)) {
            return;
        }

        if (p.decreaseFood(appetite)) {
            satiety = true;
            System.out.printf("%s сыт!%n", name);
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", satiety=" + satiety +
                '}';
    }
}