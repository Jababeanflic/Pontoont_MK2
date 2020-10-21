package Pontoo_MK2;

import java.util.Scanner;

/**
 * Pontoo_MK2
 * @author 18025316
 * Scott Kinsmnan
 * 17/10/2020
 */

public class PlayerTurn {
    Scanner kboard = new Scanner(System.in);

    public PlayerTurn() {
    }

    public int PlayerTurn(Player player, Dealer dealer, int gamesWon){
        System.out.println("Would you like to draw a card? y/n");
        String choice = kboard.nextLine();

        while (choice.equalsIgnoreCase("y")) {
            player.setHand(dealer.playerDrawCard());

            if (busted(player.getUserTotal())) {
                System.out.println("Your bust with " + player.getUserTotal());
                player.UserShout();
                //Statistics.cardsDrawn(cardsDrawn, totalCardsDrawn);
                break;
            }// end if
            System.out.println("Would you like to draw a card? y/n");
            choice = kboard.nextLine();
        } return gamesWon;
    }


    public boolean getResult(int total, int dealer) {
        return total > dealer && total <= 21;
    }

    /**
     * @param total int total
     * @return boolean
     * If total is over 21 false returned under 21 true
     */
    public boolean busted(int total) {
        return total > 21;
    }


}
