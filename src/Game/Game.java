package Game;


public class Game {
    GameSettings newGameSettings = new GameSettings();


    public void printGameInfo() {
        System.out.println("Количество игроков:" + newGameSettings.getNumberOfPlayers());
        System.out.println("Количество раундов сыграно: " + newGameSettings.getRoundsCounter());
        if (newGameSettings.getChangeShootDirection()) {
            System.out.println("Игроки стреляют не меняя направления");
        } else {
            System.out.println("Игроки каждый раунд меняют направление стрельбы");
        }

    }
}