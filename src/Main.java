import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите цель расчета: ");
        System.out.println("1. Площадь");
        System.out.println("2. Длина окружности");
        int choice = scanner.nextInt();

        double radius;
        do {
            System.out.println("Введите радиус:");
            while (!scanner.hasNextDouble()) {
                System.out.println("Некорректный ввод. Пожалуйста, введите число:");
                scanner.next();
            }
            radius = scanner.nextDouble();
        } while (radius <= 0);

        switch (choice) {
            case 1:
                double area = calculateArea(radius);
                System.out.println("Площадь круга: " + area);
                break;
            case 2:
                double circumference = calculateCircumference(radius);
                System.out.println("Длина окружности: " + circumference);
                break;
            default:
                System.out.println("Некорректный выбор.");
        }

        scanner.close();
    }

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }
}