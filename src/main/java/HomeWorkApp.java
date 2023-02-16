public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();

        checkSumSign();

        printColor();

        compareNumbers();


    }

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    private static void checkSumSign() {

        int a = 4;
        int b = -20;
        int result = a + b;
        if (result >= 0) {
            System.out.println("Сумма положительная");
        }
        else if (result < 0) {
            System.out.println("Сумма отрицательная");

        }
    }

    private static void printColor() {
        int value = 30;
        if (value <= 0) {
            System.out.println("Красный");
            

        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
            
        } else if (value > 100) {
            System.out.println("Зеленый");
            
        }

    }

    private static void compareNumbers() {
        int a = 2;
        int b = 65;
        if (a >= b) {
            System.out.println("a >= b");

        }
        else {
            System.out.println("a < b");
        }
    }


}
