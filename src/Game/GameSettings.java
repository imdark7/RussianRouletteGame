package Game;

/**
 * Created by Григорий on 17.11.2015.
 */
public class GameSettings {
    private int roundsCounter = 0;
    private int numberOfPlayers = 6;
    private static boolean changeShootDirection = false;
    private static boolean reloadGunEveryRound = false;


    public int getRoundsCounter() {
        return roundsCounter;
    }
    public void setRoundsCounter(int roundsCounter) {
        this.roundsCounter = roundsCounter;
    }

    public boolean getChangeShootDirection() {
        return changeShootDirection;
    }
    public static void setChangeShootDirection(boolean changeShootDirection) {
        GameSettings.changeShootDirection = changeShootDirection;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }
    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public static boolean isReloadGunEveryRound() {
        return reloadGunEveryRound;
    }
    public static void setReloadGunEveryRound(boolean reloadGunEveryRound) {
        GameSettings.reloadGunEveryRound = reloadGunEveryRound;
    }

}