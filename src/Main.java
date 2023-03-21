import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");

        String string = scanner.nextLine();
        System.out.println("Привет "+ string);

    }

}