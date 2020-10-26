package Pontoo_MK2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Pontoon_MK2
 *
 * @author 18025316
 * Scott Kinsmnan
 * 17/10/2020
 */
public class DeckOfCards {

    private final ArrayList<Card> deck;

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

        // private Image backOfCardImage;
        Card nCard = new Card();
        List<Suits> suits = nCard.getValidSuit();
        List<FaceNames> faceNames = nCard.getValidFaceNames();

        deck = new ArrayList<>();

        for (Suits suit:suits){
            for (FaceNames faceName:faceNames)
                deck.add(new Card(faceName,suit));
        }
        Collections.shuffle(deck);
    }

    /**
     * Deal top card and remove from deck
     */
    public Card drawTopCard(){
        if (deck.size()>0)
            return deck.remove(0);
        else
            return null;
    }

    /**
     * Shuffle deck of cards
     */
    public void shuffle(){
        Collections.shuffle(deck);
    }
}// end class

