package Pontoo_MK2;

/**
 * Pontoo_MK2
 * @author 18025316
 * Scott Kinsmnan
 * 17/10/2020
 */

public class PlayerTurn extends TurnController {

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
}