package lesson7;

import java.util.Random;

public class Cat {

    private Random random = new Random();
    private final String name;
    private static int countCats;
    private boolean satiety = false;

    public Cat(String name) {
        this.name = name;
        countCats++;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }
    public boolean getSatiety() {return satiety;}




    public static int getCountCats() {
        return countCats;
    }
    public void eat(Plate plate) {
            plate.decreaseFood(random.nextInt(4) + 3);
    }
    public void printInfo() {
        if (satiety == true){
            System.out.printf("Кот %s наелся %n", name);
        } else
        System.out.printf("Кот %s остался голодным %n", name);
    }
}