package Game;

public class Round {
    public void start() {
        System.out.println("Игроки стреляют.");

        if (GameSettings.getChangeShootDirection()) {
            for (int x = 0; x < Game.getPlayersAmount(); x++) {
                if (x % 2 == 0) {
                    for (int i = 0; i < Game.getPlayersAmount(); i++) {
                        if (i + 1 != Game.getPlayersAmount()) {
                            if (Game.players.get(i).tryToShoot()) {
                                Game.players.get(i + 1).setDeathStatus();
                                Game.players.get(i).chargeGun();
                            }
                        } else {
                            if (Game.players.get(i).tryToShoot()) {
                                Game.players.get(0).setDeathStatus();
                                Game.players.get(i).chargeGun();
                            }
                        }
                    }
                } else {
                    for (int i = 0; i < Game.getPlayersAmount(); i++) {
                        if (i - 1 != 0) {
                            if (Game.players.get(i).tryToShoot()) {
                                Game.players.get(i - 1).setDeathStatus();
                                Game.players.get(i).chargeGun();
                            }
                        } else {
                            if (Game.players.get(i).tryToShoot()) {
                                Game.players.get(Game.getPlayersAmount() - 1).setDeathStatus();
                                Game.players.get(i).chargeGun();
                            }
                        }
                    }
                }
            }
        }

        for (int i = 0; i < Game.getPlayersAmount(); i++) {
            if (i + 1 != Game.getPlayersAmount()) {
                if (Game.players.get(i).tryToShoot()) {
                    Game.players.get(i + 1).setDeathStatus();
                    Game.players.get(i).chargeGun();
                }
            } else {
                if (Game.players.get(i).tryToShoot()) Game.players.get(0).setDeathStatus();
            }
        }
        for (int i = Game.getPlayersAmount() - 1; i >= 0; i--) {
            if (Game.players.get(i).getDeathStatus()) Game.players.remove(i);
        }
        if (GameSettings.isReloadGunEveryRound()) {
            for (int i = 0; i < Game.getPlayersAmount(); i++) Game.players.get(i).chargeGun();
        }
        GameSettings.setNumberOfPlayers(Game.getPlayersAmount());
        printRoundInfo();
    }

    public void printRoundInfo(){
        if (Game.getPlayersAmount() < 1) {
            System.out.println("Игра окончена, никто не выжил");
            System.out.println("Количество раундов сыграно: " + GameSettings.getRoundsCounter());
        } else if (Game.getPlayersAmount() == 1) {
            System.out.println("Победил игрок под номером:" + Game.players.get(0).getPlayerNumber());
            System.out.println("Количество раундов сыграно: " + GameSettings.getRoundsCounter());
        } else {
            System.out.println("Осталось живых игроков: " + GameSettings.getNumberOfPlayers());
            System.out.println("Количество раундов сыграно: " + GameSettings.getRoundsCounter());

        }
    }
}
