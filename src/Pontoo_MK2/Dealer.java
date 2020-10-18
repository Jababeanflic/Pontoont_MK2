package Pontoo_MK2;

import java.util.ArrayList;

/**
 * Pontoo_MK2
 * Dealer object holding dealer cards and hand total
 * @author 18025316
 * Scott Kinsmnan
 * 17/10/2020
 */
public class Dealer {

    private ArrayList<Card> hand;
    private int dealerTotal;

    /**
     * Constructor Array List to hold card objects
     */
    public Dealer(){
        hand = new ArrayList<>();
    }

    /**
     * @return Hand object containing card objects
     */
    public ArrayList<Card> getHand() {
        return hand;
    }

    /**
     * @param dealerCard Card object
     * Adds card object to card
     * Add card value to cumulative player total
     */
    public void setHand(Card dealerCard) {
        hand.add(dealerCard);
        dealerTotal=dealerTotal+dealerCard.getValue();
    }

    /**
     * @return Int dealer current total
     */
    public int getDealerTotal() {
        return dealerTotal;
    }

    public void setDealerTotal(int dealerTotal) {
        this.dealerTotal = dealerTotal;
    }
}
