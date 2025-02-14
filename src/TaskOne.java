import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        // Todo Задача 1: Расчет суммы и среднего значения
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите первое число: ");
        int nomberOne = scanner.nextInt();
        System.out.print("введите второе число: ");
        int nomberTwo = scanner.nextInt();
        int sum = (nomberOne + nomberTwo);
        double average = (nomberOne + nomberTwo) / 2;

        System.out.println("Сумма: " + sum);
        System.out.println("Среднее значение: " + average);
    }
}
