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
        createPlayers(GameSettings.getNumberOfPlayers());

        System.out.println("2. Будут ли игроки перезаряжать револьвер каждый раунд, не зависимо от того, произошел ли у них выстрел?(да/нет)");
        answer = scanner.next();
        if (answer.toLowerCase().equals("да")) {
            GameSettings.setReloadGunEveryRound(true);
        }

        System.out.println("3. Объем барабана револьвера:");
        GameSettings.setBulletsInTheGun(scanner.nextInt());

        System.out.println("4. Введите объем барабана револьвера (по умолчанию: 6) :");
        while (true) {
            int number = scanner.nextInt();
            if (number > 0) {
                GameSettings.setBulletsInTheGun(number);
                break;
            } else {
                System.out.println("Введите число больше нуля");
            }
        }

        System.out.println("5. Игроки будут стрелять в себя или в других?( 1 - в себя, 2 - в других) :");
        while (true) {
            int number = scanner.nextInt();
            if (number == 1 || number == 2) {
                GameSettings.setShootingToYourself(true);
                break;
            } else {
                System.out.println("Введите 1 или 2 :");
            }
        }

        if (!GameSettings.isShootingToYourself()) {
            System.out.println("6. Будут ли игроки менять направление стрельбы каждый раунд?(да/нет)");
            answer = scanner.next();
            if (answer.toLowerCase().equals("да")) {
                GameSettings.setChangeShootDirection(true);
            }
        }

        GameSettings.setChosenPlayer();
        System.out.println("Вам присвоен номер " + GameSettings.getChosenPlayer());


        System.out.println();
        System.out.println("Отлично, настройки записаны.");
    }

    public void createPlayers(int numberOfPlayers) {
        for (int i = 0; i < numberOfPlayers; i++) {
            Player player = new Player(i + 1);
            players.add(player);
            player.chargeGun();
        }
    }
}