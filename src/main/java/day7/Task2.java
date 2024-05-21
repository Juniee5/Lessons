package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int rn = random.nextInt(100 - 99 + 1) + 90;
        Player player1 = new Player(90);

        Player.info();

        Player player2 = new Player(91);
        Player player3 = new Player(92);

        Player.info();

        Player player4 = new Player(93);
        Player player5 = new Player(94);
        Player player6 = new Player(94);

        Player.info();

        Player player7 = new Player(100);

        Player.info();

        for(int i = 0; i < 91; i++)
            player1.run();

        Player.info();
    }
}
