package learnCollection;

import java.util.*;

public class MapQuiz {
    HashMap<String, Integer> players;
    MapQuiz() {
        players = new HashMap<String, Integer>();
    }
    public void addPlayer(String name, int p) {
        players.put(name, p);
    }

    //your code goes here
    public void getWinner() {
        int max = 0;
        String winner = "";
        for (String name: players.keySet()) {
            int x = players.get(name);
            if (x > max){
                max = x;
                winner = name;
            }
        }
        System.out.println(winner);
    }

}

class Program {
    public static void main(String[ ] args) {
        MapQuiz game = new MapQuiz();
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<3;i++) {
            String input = sc.nextLine();
            String[] values = input.split(" ");
            String name = values[0];
            int points = Integer.parseInt(values[1]);
            game.addPlayer(name, points);
        }
        game.getWinner();
    }
}