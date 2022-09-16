package hackerrank.corejava.dataStructures;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ComparatorExample {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int T = sc.nextInt();

        List<Player> players = new ArrayList<>();
        while (T-- > 0) {
            String name = sc.next();
            int score = sc.nextInt();

            Player player = new Player(name, score);
            players.add(player);
        }

        players.sort(
                Comparator.comparing(Player::getScore)
                        .reversed() // decresing order
                        .thenComparing(Player::getName));

        for (Player player : players) {
            System.out.println(player.getName() + " " + player.getScore());
        }
        sc.close();
    }
}

class Player {
    private String name;
    private int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
