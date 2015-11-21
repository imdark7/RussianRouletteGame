package Game;

import java.util.ArrayList;
import java.util.Scanner;

public  class Game {
    static ArrayList<Player> players = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public static int getPlayersAmount() {
        return players.size();
    }

    public void startGame() {
        while (players.size() > 1) {
            GameSettings.setRoundsCounter(GameSettings.getRoundsCounter() + 1);
            System.out.println(GameSettings.getRoundsCounter() + " раунд.");
            Round newRound = new Round();
            newRound.start();
        }
    }

    public void initSettings() {
        String answer;
        System.out.println("Выберите настройки игры:");
        System.out.println("1. Количество участников:");
        int players = scanner.nextInt();
        GameSettings.setNumberOfPlayers(players);

        System.out.println("2. Будут ли игроки менять направление стрельбы каждый раунд?(да/нет)");
        answer = scanner.next();
        if (answer.toLowerCase().equals("да")) {
            GameSettings.setChangeShootDirection(true);
        }

        System.out.println("3. Будут ли игроки перезаряжать револьвер каждый раунд, не зависимо от того, произошел ли у них выстрел?(да/нет)");
        answer = scanner.next();
        if (answer.toLowerCase().equals("да")) {
            GameSettings.setReloadGunEveryRound(true);
        }
        System.out.println();
        System.out.println("Отлично, настройки записаны.");
    }

    public void createPlayers(int numberOfPlayers) {
        for (int i = 0; i < numberOfPlayers; i++) {
            Player player = new Player(i);
            players.add(player);
            player.chargeGun();
        }
    }
}