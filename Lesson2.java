package gb3;

public class Lesson2 {

    public static void main(String[] args) {
      //  System.out.println(sum(-4,9));
      //  plusMinus(-9);
      //  System.out.println( plusMinus2(-9));
        // strings("Hello",3);
        System.out.println( years(2021));
    }
    public static boolean sum(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        }
        return false;
    }

    public static void plusMinus(int x) {
        if ( x >= 0 ) {
            System.out.println("Число положительное");
        } else System.out.println("Число отрицательное");
    }

    public static boolean plusMinus2(int a) {
        if (a >= 0) {
            return false;
        }
        return true;
    }
    public static void strings(String string, int c) {
       for ( int y = 0; y < c; y++ )
        System.out.println(string);
    }

    public static boolean years(int year) {
        int x = year % 4;
        int y = year % 400;
        int z = year % 100;
        if ( x == 0 && z != 0 || y == 0) {
            return true;
        }
        return false;
    }
}
