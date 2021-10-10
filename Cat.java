package lesson6;

public class Cat extends Animal {
    private static int countCats;
    public Cat(String name) {
        super(name);
        countCats++;
    }
    public static int getCountCats() {
        return countCats;
    }

    public void setRun(int run) {
        this.run = run;
        if (run > 200) {
            System.out.println(this.getName() + " не может пробежать больше 200 метров");
        } else System.out.printf("%s пробежал %d метров%n", this.getName(), this.getRun());
    }

    public void setSwim(int swim) {
        this.swim = swim;
            System.out.println(this.getName() + " не умеет плавать");
    }
}

