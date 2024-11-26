public class Task312 {

    public static void main(String[] args) {
        printResults(0.01);  // Приклад: ε = 0.01
        printResults(0.0001); // Приклад: ε = 0.0001
        printResults(-0.1);  // Помилковий аргумент
    }

    public static double calculateInfiniteSum(double epsilon) {
        if (epsilon <= 0) {
            throw new IllegalArgumentException("Точність ε має бути більше 0. Отримано: " + epsilon);
        }

        double sum = 0;
        double term;
        int k = 1;

        do {
            term = 1.0 / (k * k); // Наприклад, використовується ряд 1/k^2
            sum += term;
            k++;
        } while (Math.abs(term) >= epsilon);

        return sum;
    }

    public static void printResults(double epsilon) {
        System.out.print("ε: " + epsilon + " result: ");
        try {
            System.out.println(calculateInfiniteSum(epsilon));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}
