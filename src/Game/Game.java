package Game;


import java.util.Scanner;

public  class Game {
    GameSettings newGameSettings = new GameSettings();

    Scanner scanner = new Scanner(System.in);

    public void printGameInfo() {
        System.out.println("Количество игроков:" + newGameSettings.getNumberOfPlayers());
        System.out.println("Количество раундов сыграно: " + newGameSettings.getRoundsCounter());
        if (newGameSettings.getChangeShootDirection()) {
            System.out.println("Игроки стреляют не меняя направления");
        } else {
            System.out.println("Игроки каждый раунд меняют направление стрельбы");
        }
    }

    public void initSettings() {
        System.out.println("Выберите настройки игры:");
        System.out.print("1. Количество участников: ");
        newGameSettings.setNumberOfPlayers(scanner.nextInt());
        System.out.print("2. Будут ли игроки менять направление стрельбы каждый раунд? : ");
        String changeDirection = scanner.nextLine();
        if (changeDirection == "Да" || changeDirection == "да") newGameSettings.setChangeShootDirection(true);
        System.out.print("3. Будут ли игроки перезаряжать заново револьвер, не зависимо от того, произошел ли у них выстрел? : ");
        String reloadEveryRound = scanner.nextLine();
        if (reloadEveryRound == "Да" || reloadEveryRound == "да") newGameSettings.setReloadGunEveryRound(true);
    }
}