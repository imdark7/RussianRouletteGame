import Game.Game;
import Game.GameSettings;
import Game.Round;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Хотите сыграть в русскую рулетку?");
        Scanner scanner = new Scanner(System.in);
        String wannaPlay = scanner.nextLine();

        if (Objects.equals(wannaPlay,"да") || Objects.equals(wannaPlay, "Да")) {
            Game newGame = new Game();
            newGame.initSettings();
            newGame.createPlayers(GameSettings.getNumberOfPlayers());
            newGame.startNewRound();


        } else {
            System.out.println("Может быть в другой раз.");
        }
    }
}