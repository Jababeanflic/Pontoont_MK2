package Pontoo_MK2;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.List;

/**
 * Pontoo_MK2
 *
 * @author 18025316
 * Scott Kinsmnan
 * 17/10/2020
 */
public class Card {

    private String faceName;
    private String suit;
    private int value;
    // private Image image;


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

    public void setSuit(String suit) {
        List<String> validSuits = getValidSuit();
        suit = suit.toLowerCase();

        if (validSuits.contains(suit))
            this.suit = suit;
        else
            throw new IllegalArgumentException("Not a valid suit, valid suits are " +validSuits);
    }

    public static List<Integer> getValidValue(){
        return Arrays.asList(2,3,4,5,6,7,8,9,10,11,12,13);
    }

    public int getValue() {
       return value;
    }

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
     * @return
     */
    public String toString(){
        return String.format(faceName+" of " +suit+ " Value: " +value);
    }
}
