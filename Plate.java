package lesson7;

import java.util.Random;

public class Plate {
    private Random random = new Random();
    private int foodCount;

    public Plate(int foodCount) {
        this.foodCount = foodCount;
    }

    public void printInfo() {
        System.out.println("Кол-во еды в миске: " + foodCount);
    }

    public void decreaseFood(int catEatFoodCount) {
        foodCount -= catEatFoodCount;
    }

    public int getFoodCount() {
        return foodCount;
    }

    public void addFood() {
        foodCount += random.nextInt(7) + 11;
    }

}
