package Pontoo_MK2;

import java.util.Arrays;
import java.util.List;

/**
 * Pontoo_MK2
 * Card class creates individual card objects with a face name, suit and value
 * @author 18025316
 * Scott Kinsmnan
 * 17/10/2020
 */
public class Card {

    private String faceName;
    private String suit;
    private int value;
    // private Image image;


    /**
     * @param faceName String facename
     * @param suit String suit
     */
    public Card(String faceName, String suit) {
        setFaceName(faceName);
        setSuit(suit);
        setValue();
    }

    public String getFaceName() {
        return faceName;
    }

    /**
     * List of face names
     */
    public static List<String> getValidFaceNames(){
        return Arrays.asList("2","3","4","5","6","7","8","9","10","jack","queen","king","ace");
    }

    /**
     * @param faceName valid face names
     * validates and sets facename
     */
    public void setFaceName(String faceName) {
        List<String> validFaceNames = getValidFaceNames();
        faceName = faceName.toLowerCase();

        if (validFaceNames.contains(faceName))
            this.faceName = faceName;
        else
            throw new IllegalArgumentException("Not a valid face name");
    }

    public String getSuit() {
        return suit;
    }

    /**
     * List of suits
     */
    public static List<String> getValidSuit(){
        return Arrays.asList("hearts","diamonds","spades","clubs");
    }

    /**
     * @param suit String suit
     * Validates and sets suit
     */
    public void setSuit(String suit) {
        List<String> validSuits = getValidSuit();
        suit = suit.toLowerCase();

        if (validSuits.contains(suit))
            this.suit = suit;
        else
            throw new IllegalArgumentException("Not a valid suit, valid suits are " +validSuits);
    }

    public int getValue() {
       return value;
    }

    /**
     * Sets a value depending on face name
     * Parses any String numbers to ints or converts named cars to correct value
     */
    public void setValue() {

        if (faceName.equals("jack")||faceName.equals("queen")||faceName.equals("king")||faceName.equals("ace")) {
            value = 10;
            if (faceName.equals("ace"))
                value = 11;
        }
        else
            value = Integer.parseInt(faceName);
    }

    /**
     * @return String with face name, suit and value
     */
    public String toString(){
        return String.format(faceName+" of " +suit+ " Value: " +value);
    }
}
