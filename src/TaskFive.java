import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите N: ");
        int number = scanner.nextInt();
        for (int i = number  ; i >= 1; i--){
            System.out.println(i);
        }
    }
}
