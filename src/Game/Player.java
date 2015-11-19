package Game;

public class Player {
    private boolean isDead = false ;
    int playerNumber;
    private int bullet;

    public boolean tryToShoot() {
        if (bullet == 0) {
            return true;
        } else {
            bullet--;
            return false;
        }
    }
    public void chargeGun() {
        bullet = (int)(Math.random() * 6);
    }
    public void setDeathStatus() {
        isDead = true;
    }
    public boolean getDeathStatus() {
        return isDead;
    }
    public Player(int number) {
        playerNumber = number;
    }
    public int getPlayerNumber() {
        return playerNumber;
    }
}
