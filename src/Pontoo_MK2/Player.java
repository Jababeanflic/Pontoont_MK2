package Pontoo_MK2;

import java.util.ArrayList;

/**
 * Pontoo_MK2
 * Player object holding player cards and hand total
 * @author 18025316
 * Scott Kinsmnan
 * 17/10/2020
 */
public class Player {

    private ArrayList<Card> hand;
    private int playerTotal;

    /**
     * Constructor Array List to hold card objects
     */
    public Player(){
        hand = new ArrayList<>();
    }

    /**
     * @return Hand object containing card objects
     */
    public ArrayList<Card> getHand() {
        return hand;
    }

    /**
     * @param playerCard  Card object
     * Adds card object to card
     * Add card value to cumulative player total
     */
    public void setHand(Card playerCard) {
        hand.add(playerCard);
        playerTotal=playerTotal+playerCard.getValue();
    }

    /**
     * @return Int player current total
     */
    public int getPlayerTotal() {
        return playerTotal;
    }

    public void setPlayerTotal(int playerTotal) {
        this.playerTotal = playerTotal;
    }
}
