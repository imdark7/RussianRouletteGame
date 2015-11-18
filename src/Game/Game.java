package Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public  class Game {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Player> players = new ArrayList<>();

    public void printGameInfo() {
        if (players.isEmpty()) {
            System.out.println("Никто не выжил");
        } else {
            System.out.println("Победил игрок под номером:" + players.get(0));
            System.out.println("Количество раундов сыграно: " + GameSettings.getRoundsCounter());
        }
    }

    public void startNewRound() {
        GameSettings.setRoundsCounter(GameSettings.getRoundsCounter() + 1);
        System.out.println(GameSettings.getRoundsCounter() + " раунд.");
        Round newRound = new Round();
        newRound.start();
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