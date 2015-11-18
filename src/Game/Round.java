package Game;

import java.util.Scanner;

public class Round {

    public static void start() {

    }

    public static void settings() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество игроков: ");
        int countPlayers = scanner.nextInt();
        currentSettings.setNumberOfPlayers(countPlayers);
        System.out.println("Менять ли направление выстрела?");
        String answer2 = scanner.nextLine();
        if (answer2 == "да" || answer2 == "Да");

    }
}
