package Pontoo_MK2;

import java.util.Scanner;

import static Pontoo_MK2.GamesPlayed.playerContinue;

/**
 * Pontoo_MK2
 * Pontoon class is the game controller. Instantiates and controls object actions.
 * Give user options and dealer AI reacts accordingly
 * Tracks and updates all objects and statistics
 *
 * @author 18025316
 * Scott Kinsmnan
 * 17/10/2020
 */
public class Pontoon {

    public Pontoon() {
        Scanner kboard = new Scanner(System.in);
        DeckOfCards deck = new DeckOfCards();
        GamesPlayed gamesCount = new GamesPlayed();
        deck.shuffle();

        int gamesPlayed = 0;
        boolean PlayGame;
        int gamesWon = 0;

        do {
            Player player = new Player();
            Dealer dealer = new Dealer();

            Card playerCard1 = deck.drawCardPlayer();
            Card playerCard2 = deck.drawCardPlayer();
            player.setHand(playerCard1);
            player.setHand(playerCard2);

            Card dealerCard1 = deck.drawCardDealer();
            Card dealerCard2 = deck.drawCardDealer();
            dealer.setHand(dealerCard1);
            dealer.setHand(dealerCard2);

            System.out.println("Would you like to draw a card? y/n");
            String choice = kboard.nextLine();

            while (choice.equalsIgnoreCase("y")) {
                playerCard1 = deck.drawCardPlayer();
                player.setHand(playerCard1);

                if (busted(player.getPlayerTotal())) {
                    System.out.println("Your bust with " + player.getPlayerTotal());
                    //Statistics.cardsDrawn(cardsDrawn, totalCardsDrawn);
                    break;
                }// end if
                System.out.println("Would you like to draw a card? y/n");
                choice = kboard.nextLine();
            }

            if (player.getPlayerTotal() <= 21) {
                while (dealer.getDealerTotal() < player.getPlayerTotal() & dealer.getDealerTotal() <= 21) {
                    dealerCard1 = deck.drawCardDealer();
                    dealer.setHand(dealerCard1);
                    //dealerTotal = dealerTotal + dealerCard1.getValue();
                    if (busted(dealer.getDealerTotal())) {
                        System.out.println("Dealer bust with " + dealer.getDealerTotal() + " you win!");
                        gamesWon++;
                        break;
                    }
                }

                if (dealer.getDealerTotal() <= 21) {
                    if (getResult(player.getPlayerTotal(), dealer.getDealerTotal())) {
                        System.out.println("You have won with a total of " + player.getPlayerTotal() + " Dealer has " + dealer.getDealerTotal());
                        gamesWon++; // track games one
                    } else {
                        System.out.println("You have lost with a total of " + player.getPlayerTotal() + " Dealer has " + dealer.getDealerTotal());
                    }// end if
                }
            }

            System.out.println("Show players hand");
            System.out.println(player.getHand());
            System.out.println("Show dealers hand");
            System.out.println(dealer.getHand());
            System.out.println("Player Total: " + player.getPlayerTotal());
            System.out.println("Dealer Total: " + dealer.getDealerTotal());

            gamesPlayed++;
            gamesCount.playerContinue(gamesPlayed);
            //GamesPlayed game = new GamesPlayed(playerContinue(gamesPlayed));
            /*
             * Choose to play again return True/False
             */
            PlayGame = gamesCount.getPlayGame();

        } while (PlayGame);

        /*
         * calculate win percent pass gamesWon and games played total
         */
        Statistics.statistic(gamesWon, gamesPlayed);
    }

    public static boolean getResult(int total, int dealer) {
        return total > dealer && total <= 21;
    }

    /**
     * @param total
     * @return
     */
    public static boolean busted(int total) {
        return total > 21;
    }
}
