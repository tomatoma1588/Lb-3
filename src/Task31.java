
public class Task31 {

    public static void main(String[] args) {
        printResults(10);  // Приклад: сума ряду для n = 10
        printResults(20);  // Для n = 20
        printResults(-5);  // Помилковий аргумент
    }

    public static double calculateSeriesSum(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Параметр n має бути більше 0. Отримано: " + n);
        }

        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }

    public static void printResults(int n) {
        System.out.print("n: " + n + " result: ");
        try {
            System.out.println(calculateSeriesSum(n));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}
