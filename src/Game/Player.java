package Game;

public class Player {
    private boolean isDead = false ;
    int playerNumber;
    private int bullet;

    public boolean tryToShoot() {
        if (bullet != 1) {
            bullet -= 1;
            return false;
        } else {
            return true;
        }
    }
    public void chargeGun() {
        int a = (int)(Math.random() * 6);
        bullet = a;
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
