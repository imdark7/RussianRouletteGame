
import Game.Game;
import Game.Round;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Хотите сыграть в русскую рулетку?");
        Scanner scanner = new Scanner(System.in);
        String wannaPlay = scanner.nextLine();
        if (wannaPlay == "да" || wannaPlay == "Да") {
            Game newGame = new Game();

        }

        Round.settings();
        Round.start();

    }
}