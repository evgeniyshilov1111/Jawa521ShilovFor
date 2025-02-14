import java.util.Scanner;

public class TaskFour {
    // Todo 4: Таблица умножения
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" введите число: ");
        int number = scanner.nextInt();
        System.out.println("Таблица умножения для числа " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }
    }
}