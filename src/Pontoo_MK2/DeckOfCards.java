package Pontoo_MK2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Pontoo_MK2
 *
 * @author 18025316
 * Scott Kinsmnan
 * 17/10/2020
 */
public class DeckOfCards {

    private ArrayList<Card> deck;
    // private Image backOfCardImage;

    /**
     * This passes in a specific collection of cards
     * @param deck
     */
    public DeckOfCards(ArrayList<Card> deck) {
        this.deck = deck;
    }

    /**
     * No arguments passed in, so creates standard deck of cards
     */
    public DeckOfCards(){

        List<String> suits = Card.getValidSuit();
        List<String> faceNames = Card.getValidFaceNames();

        deck = new ArrayList<>();

        for (String suit:suits){
            for (String faceName:faceNames)
                deck.add(new Card(faceName,suit));
        }
    }

    /**
     * Deal top card
     */
    public Card drawTopCard(){
        if (deck.size()>0)
            return deck.remove(0);
        else
            return null;
    }

    public Card drawCardPlayer(){
        Card newCard = drawTopCard();
        System.out.println("You drew "+newCard);
        return newCard;
    }

    public Card drawCardDealer(){
        Card newCard = drawTopCard();
        return newCard;
    }

    /**
     * Shuffle deck of cards
     */
    public void shuffle(){
        Collections.shuffle(deck);
    }
}
