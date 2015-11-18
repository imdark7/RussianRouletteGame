package Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public  class Game {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Player> players = new ArrayList<>();

    public static void printGameInfo() {
        System.out.println("Количество игроков:" + GameSettings.getNumberOfPlayers());
        System.out.println("Количество раундов сыграно: " + GameSettings.getRoundsCounter());
        if (GameSettings.getChangeShootDirection()) {
            System.out.println("Игроки стреляют не меняя направления");
        } else {
            System.out.println("Игроки каждый раунд меняют направление стрельбы");
        }
    }

    public void startNewRound() {
        GameSettings.setRoundsCounter(GameSettings.getRoundsCounter() + 1);
        System.out.println(GameSettings.getRoundsCounter() + " раунд.");
        Round.start();
    }

    public void initSettings() {
        String answer;
        System.out.println("Выберите настройки игры:");
        System.out.println("1. Количество участников:");
        int players = scanner.nextInt();
        GameSettings.setNumberOfPlayers(players);

        System.out.println("2. Будут ли игроки менять направление стрельбы каждый раунд?(да/нет)");
        answer = scanner.next();
        if (Objects.equals(answer, "Да") || Objects.equals(answer, "да")) {
            GameSettings.setReloadGunEveryRound(true);
        }

        System.out.println("3. Будут ли игроки перезаряжать револьвер каждый раунд, не зависимо от того, произошел ли у них выстрел?(да/нет)");
        answer = scanner.next();
        if (Objects.equals(answer, "Да") || Objects.equals(answer, "да")) {
            GameSettings.setReloadGunEveryRound(true);
        }
        System.out.println();
        System.out.println("Отлично, настройки записаны.");
    }

    public void createPlayers(int numberOfPlayers) {
        for (int i = 0; i < numberOfPlayers; i++) {
            Player player = new Player(i);
            players.add(player);
        }
    }
}