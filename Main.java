package lesson6;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Васька");
        Dog dog1 = new Dog("Шарик");
        Cat cat2 = new Cat("Мурзик");
        Dog dog2 = new Dog("Хатико");
        Cat cat3 = new Cat("Беляш");

        System.out.println("Всего животных: " + Animal.getCountAnimals());
        System.out.println("Всего котов: " + Cat.getCountCats());
        System.out.println("Всего собак: " + Dog.getCountDogs());

        cat1.setRun(150);
        dog1.setRun(600);
        cat2.setSwim(5);
        dog2.setSwim(5);
        cat3.setRun(300);

    }
}
