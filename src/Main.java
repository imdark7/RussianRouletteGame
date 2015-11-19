import Game.Game;
import Game.GameSettings;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Хотите сыграть в русскую рулетку?");
        Scanner scanner = new Scanner(System.in);
        String wannaPlay = scanner.nextLine();

        if (wannaPlay.toLowerCase().equals("да")) {
            Game newGame = new Game();
            newGame.initSettings();
            newGame.createPlayers(GameSettings.getNumberOfPlayers());
            newGame.startGame();


        } else {
            System.out.println("Может быть в другой раз.");
        }
    }
}