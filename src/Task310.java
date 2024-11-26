
public class Task310 {

    public static void main(String[] args) {
        printResults(5);    // Приклад для x = 5
        printResults(-2);   // Помилковий аргумент
        printResults(10);   // Інший тест
    }

    public static double calculateFunction(double x) {
        if (x < 0) {
            throw new IllegalArgumentException("Аргумент x має бути більше або рівним 0. Отримано: " + x);
        }
        return Math.sqrt(x) + Math.log(x + 1);
    }

    public static void printResults(double x) {
        System.out.print("x: " + x + " result: ");
        try {
            System.out.println(calculateFunction(x));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}
