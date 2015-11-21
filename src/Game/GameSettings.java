package Game;

public class GameSettings {
    private static int roundsCounter = 0;
    private static int numberOfPlayers = 6;
    private static boolean changeShootDirection = false;
    private static boolean reloadGunEveryRound = false;
    private static int bulletsInTheGun = 6;


    public static int getRoundsCounter() {
        return roundsCounter;
    }
    public static void setRoundsCounter(int roundsCounter) {
        GameSettings.roundsCounter = roundsCounter;
    }

    public static int getNumberOfPlayers() {
        return numberOfPlayers;
    }
    public static void setNumberOfPlayers(int numberOfPlayers) {
        GameSettings.numberOfPlayers = numberOfPlayers;
    }

    public static boolean isReloadGunEveryRound() {
        return reloadGunEveryRound;
    }
    public static void setReloadGunEveryRound(boolean reloadGunEveryRound) {
        GameSettings.reloadGunEveryRound = reloadGunEveryRound;
    }

    public static boolean getChangeShootDirection() {
        return changeShootDirection;
    }
    public static void setChangeShootDirection(boolean changeShootDirection) {
        GameSettings.changeShootDirection = changeShootDirection;
    }

    public static int getBulletsInTheGun() {
        return bulletsInTheGun;
    }

    public static void setBulletsInTheGun(int bulletsInTheGun) {
        GameSettings.bulletsInTheGun = bulletsInTheGun;
    }
}