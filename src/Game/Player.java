package Game;

public class Player {
    private boolean isDead = false ;
    private int playerNunber = 0;
    private int bullet = chargeGun();

    public boolean tryToShoot() {
        if (bullet != 1) {
            bullet -= 1;
            return false;
        } else {
            return true;
        }
    }


    public int chargeGun() {
        int a = (int)(Math.random() * 6);
        return a;
    }

    public Player(int number) {
        playerNunber = number;
    }
}
