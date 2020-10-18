package Pontoo_MK2;

import java.util.Scanner;

/**
 * Pontoo_MK2
 * GamesPlayed class checks the number of games played and offers the user the option to
 * play again if they are under the max games played allowed.
 * @author 18025316
 * Scott Kinsmnan
 * 17/10/2020
 */
public class GamesPlayed {

    private static boolean playGame;

    public GamesPlayed() {
    }

    /**
     * @return boolean true/false ie contiunue or not
     */
    public boolean getPlayGame() {
        return playGame;
    }

    /**
     * @param gamesPlayed int number of games played
     * @return boolean true/false ie contiunue or not
     */
    public static boolean playerContinue(int gamesPlayed) {

        if (gamesPlayed < 5) {
            Scanner kboard = new Scanner(System.in);
            System.out.println("Number of games played " + gamesPlayed + ", do you want to play again y/n?");
            String c = kboard.next();
            if (c.equalsIgnoreCase("y")) { // loop to play another game and record games played
                playGame = true; // set to true to remain in do/while loop
            } else {
                playGame = false;
            }
        } else {
            System.out.println("You have played " + gamesPlayed + " games thats the max, Bye!");
            playGame = false;
        }
        return playGame;
    }
}
