package lesson7;

public class Main {
    public static void main(String[] args) throws InterruptedException {


        Plate plate = new Plate(10);
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Мартин Лютер Кот");
        cats[1] = new Cat("Васька");
        cats[2] = new Cat("Мурзик");
        cats[3] = new Cat("Виктуар");
        cats[4] = new Cat("Афанасий");

        int cc = Cat.getCountCats();
        
        plate.printInfo();

            for (int i = 0; i < cc; i++) {
                cats[i].eat(plate);
                Thread.sleep(3000);
                cats[i].setSatiety(true);

                if (cats[i].getSatiety() == true) {
                    cats[i].printInfo();
                }
                if (cats[cc - 1].getSatiety() == true) {
                    break;
                }
                if (plate.getFoodCount() < 3) {
                    Thread.sleep(3000);
                    plate.addFood();
                    System.out.println("Добавили еды");
                }
                plate.printInfo();
            }
        System.out.println("Все коты наелись");
    }
    }

