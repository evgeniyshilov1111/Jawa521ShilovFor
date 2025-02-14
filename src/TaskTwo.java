import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        // Todo  2: Проверка четности числа
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Введите число: ");
        int x = scanner.nextInt();
        String y = x % 2 == 0 ? " число " + x + " - четное " :" число " + x + " - нечетное ";
        System.out.println(y);
    }
}
