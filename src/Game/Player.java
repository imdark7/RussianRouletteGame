package Game;

public class Player {
    int playerNumber;
    private boolean isDead = false;
    private int bullet;

    public Player(int number) {
        playerNumber = number;
    }

    public boolean tryToShoot() {
        if (bullet == 0) {
            return true;
        } else {
            bullet--;
            return false;
        }
    }

    public void chargeGun() {
        bullet = (int) (Math.random() * GameSettings.getBulletsInTheGun());
    }

    public void setDeathStatus() {
        isDead = true;
    }

    public boolean getDeathStatus() {
        return isDead;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }
}
