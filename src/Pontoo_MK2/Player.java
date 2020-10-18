package Pontoo_MK2;

import java.util.ArrayList;

/**
 * Pontoo_MK2
 *
 * @author 18025316
 * Scott Kinsmnan
 * 17/10/2020
 */
public class Player {

    private final ArrayList<Card> hand;
    private int playerTotal;

    public Player(){
        hand = new ArrayList<>();
    }

    public Player(ArrayList<Card> hand) {
        this.hand = hand;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void setHand(Card playerCard) {
        hand.add(playerCard);
        playerTotal=playerTotal+playerCard.getValue();
    }

    public int getPlayerTotal() {
        return playerTotal;
    }

    public void setPlayerTotal(int playerTotal) {
        this.playerTotal = playerTotal;
    }
}
