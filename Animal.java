package lesson6;

public abstract class Animal {
    private static int countAnimals;
    private String name;
    protected int run;
    protected int swim;

    public Animal(String name) {
        this.name = name;
        countAnimals++;
    }

    public Animal(String name, int run, int swim) {
    }

    public static int getCountAnimals() {
        return countAnimals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRun() {
        return run;
    }
    public void setRun(int run) {
        this.run = run;
    }
    public void setSwim(int swim) {
        this.swim = swim;
    }
    public int getSwim() {
        return swim;
    }
}
