package Game;

public class Round extends Game {
    public void start() {
        printRoundInfo();
        System.out.println("Игроки стреляют.");
        for (int i = 0; i < players.size(); i++) {
            if (i + 1 != players.size()) {
                if (players.get(i).tryToShoot()) players.get(i + 1).setDeathStatus();
            } else {
                if (players.get(i).tryToShoot()) players.get(0).setDeathStatus();
            }
        }
        for (int i = players.size() - 1; i >= 0; i--) {
            if (players.get(i).getDeathStatus()) players.remove(i);
        }
        GameSettings.setNumberOfPlayers(players.size());
    }

    public static void printRoundInfo(){
        System.out.println("Осталось живых игроков: " + GameSettings.getNumberOfPlayers());
    }

}
