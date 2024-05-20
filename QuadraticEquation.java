import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите коэффициенты a, b и c квадратного уравнения (ax^2 + bx + c = 0):");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Корни уравнения: " + root1 + " и " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Уравнение имеет один корень: " + root);
        } else {
            System.out.println("Уравнение не имеет действительных корней.");
        }

        scanner.close();
    }
}
