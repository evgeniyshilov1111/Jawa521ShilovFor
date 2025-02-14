import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        //Todo 3: Факториал числа
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число:");
        int nomber = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <=  nomber; i++) {
            factorial= factorial * i;
        }
        System.out.println("Факториал числа " +  nomber + " равен " + factorial + "."  );


    }
}
