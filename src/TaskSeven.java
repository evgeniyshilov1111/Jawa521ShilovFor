import java.util.Scanner;

public class TaskSeven {
    // Todo  7*: Проверка на простое число
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        if (number % 2 == 0 || number % 3 == 0 || number % 5 == 0 || number % 7 == 0) {
            System.out.println("Число " + number + " не простое.");
        } else {
            System.out.println("Число " + number + " простое.");
        }
    }
}
