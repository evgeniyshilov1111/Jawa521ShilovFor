import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        //Todo 6: Определение сезона года
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Введите номер месяца: ");
        int number = scanner.nextInt();

        switch (number) {
            case 1:
                System.out.println("Январь находится в зимнем сезоне.");
                break;
            case 2:
                System.out.println("Февраль находится в зимнем сезоне.");
                break;
            case 3:
                System.out.println("Март находится в весеннем сезоне.");
                break;
            case 4:
                System.out.println("Апрель находится в весеннем сезоне.");
                break;
            case 5:
                System.out.println("Май находится в весеннем сезоне.");
                break;
            case 6:
                System.out.println("Июнь находится в летнем сезоне.");
                break;
            case 7:
                System.out.println("Июль находится в летнем сезоне.");
                break;
            case 8:
                System.out.println("Август находится в летнем сезоне.");
                break;
            case 9:
                System.out.println("Сентябрь находится в осеннем сезоне.");
                break;
            case 10:
                System.out.println("Октябрь находится в осеннем сезоне.");
                break;
            case 11:
                System.out.println("Ноябрь находится в осеннем сезоне.");
                break;
            case 12:
                System.out.println("Декабрь находится в зимнем сезоне.");


        }
    }
}

