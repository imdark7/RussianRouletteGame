package Game;

public class Round extends Game {
    public void start() {
        System.out.println("Игроки стреляют.");
        for (int i = 0; i < players.size(); i++) {
            if (i + 1 != players.size()) {
                if (players.get(i).tryToShoot()) players.get(i + 1).setDeathStatus();
            } else {
                if (players.get(i).tryToShoot()) players.get(0).setDeathStatus();
            }
        }
        for (int i = players.size() - 1; i >= 0; i--) {
            System.out.println(players.size());
            if (players.get(i).getDeathStatus()) players.remove(i);
        }
        GameSettings.setNumberOfPlayers(players.size());
        printRoundInfo();
    }

    public void printRoundInfo(){
        if (players.size() < 1) {
            System.out.println("Игра окончена, никто не вижил");
        } else if (players.size() == 1) {
            System.out.println("Победил игрок под номером:" + players.get(0).getPlayerNumber());
            System.out.println("Количество раундов сыграно: " + GameSettings.getRoundsCounter());
        } else {
            System.out.println("Осталось живых игроков: " + GameSettings.getNumberOfPlayers());
        }
    }

}
