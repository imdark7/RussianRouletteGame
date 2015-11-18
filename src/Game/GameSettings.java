package Game;

/**
 * Created by Григорий on 17.11.2015.
 */
public class GameSettings {
    public int roundsCounter = 0;
    public int numberOfPlayers = 6;
    public boolean changeShootDirection = false;

    public void changeSettings() {
    }

    public int getRoundsCounter() {
        return roundsCounter;
    }
    public void setRoundsCounter(int roundsCounter) {
        this.roundsCounter = roundsCounter;
    }
    public boolean getChangeShootDirection() {
        return changeShootDirection;
    }
    public void setChangeShootDirection(boolean changeShootDirection) {
        this.changeShootDirection = changeShootDirection;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }
    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

}