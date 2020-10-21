package Pontoo_MK2;

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

    GamesPlayed gamesCount = new GamesPlayed();
    int gamesPlayed = 0;
    int gamesWon = 0;

    public Pontoon() {

        boolean PlayGame;

        do {
            Player player = new Player();
            Dealer dealer = new Dealer();

            setIntialHand(player, dealer);

            DealerTurn nDealerTurn = new DealerTurn();
            PlayerTurn nPlayerTurn = new PlayerTurn();
            gamesWon = nPlayerTurn.PlayerTurn(player, dealer, gamesWon);
            gamesWon = nDealerTurn.DealerTurn(player, dealer, gamesWon);

            System.out.println("Show players hand");
            System.out.println(player.getHand());
            System.out.println("Show dealers hand");
            System.out.println(dealer.getHand());
            System.out.println("Player Total: " + player.getUserTotal());
            System.out.println("Dealer Total: " + dealer.getUserTotal());

            gamesPlayed++;
            gamesCount.playerContinue(gamesPlayed);

            // Choose to play again return True/False
            PlayGame = gamesCount.getPlayGame();

        } while (PlayGame);

        // calculate win percent pass gamesWon and games played total
        Statistics.statistic(gamesWon, gamesPlayed);
    }

    public void setIntialHand(Player player, Dealer dealer) {
        player.setHand(dealer.playerDrawCard());
        player.setHand(dealer.playerDrawCard());
        dealer.setHand(dealer.drawCard());
        dealer.setHand(dealer.drawCard());
    }
}
