package Pontoo_MK2;

import java.util.ArrayList;

/**
 * Pontoo_MK2
 *
 * @author 18025316
 * Scott Kinsmnan
 * 17/10/2020
 */
public class Dealer {

    private final ArrayList<Card> hand;
    private int dealerTotal;

    public Dealer(){
        hand = new ArrayList<>();
    }

    public Dealer(ArrayList<Card> hand) {
        this.hand = hand;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void setHand(Card dealerCard) {
        hand.add(dealerCard);
        dealerTotal=dealerTotal+dealerCard.getValue();
    }

    public int getDealerTotal() {
        return dealerTotal;
    }

    public void setDealerTotal(int dealerTotal) {
        this.dealerTotal = dealerTotal;
    }
}
