package Game;


public class Round extends Game {
    public void start() {
        printRoundInfo();
        System.out.println("Игроки стреляют.");
        for (int i = 0; i < players.size(); i++) {
            players.get(i);
        }
    }

    public static void printRoundInfo(){
        System.out.println("Осталось живых игроков: " + GameSettings.getNumberOfPlayers());
    }

}
