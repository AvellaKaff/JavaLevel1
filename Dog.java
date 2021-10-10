package lesson6;

public class Dog extends Animal {
    private static int countDogs;
    public Dog(String name) {
        super(name);
        countDogs++;
    }
    public static int getCountDogs() {
        return countDogs;
    }
    public void setRun(int run) {
        this.run = run;
        if (run > 500) {
            System.out.println(this.getName() + " не может пробежать больше 500 метров");
        } else System.out.printf("%s пробежал %d метров%n", this.getName(), this.getRun());
    }
    public void setSwim(int swim) {
        this.swim = swim;
        if (swim > 10) {
            System.out.println(this.getName() + " не может проплыть больше 10 метров");
        } else System.out.printf("%s проплыл %d метров%n", this.getName(), this.getSwim());
    }
}
