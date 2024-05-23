package day7;

public class Player {
    private int stamina;
    private final static int MAX_STAMINA = 100;
    private final static int MIN_STAMINA = 0;
    private static int countPlayers;

    public Player(int stamina){
        this.stamina = stamina;

        if(countPlayers < 6)
            countPlayers++;
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run(){
        if(stamina == 0)
            return;

        stamina--;

        if(stamina == 0)
            countPlayers--;
    }

    public static void info(){
        if(countPlayers < 5 && countPlayers > 1){
            System.out.println("Команды неполные. На поле еще есть " +  (6 - countPlayers) + " свободных мест");
        } else if(countPlayers == 1){
            System.out.println("Команды неполные. На поле еще есть 1 свободное место");
        } else{
            System.out.println("На поле нет свободных мест");
        }
    }
}
