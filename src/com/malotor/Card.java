package com.malotor;

public class Card implements Comparable<Card>{
    protected int number;
    protected char suit;

    public Card(int number , char suit) {
        /*
        char c = stringcard.charAt(0);
        switch (c) {
            case 'T': number = 10; break;
            case 'J': number = 11; break;
            case 'Q': number = 12; break;
            case 'K': number = 13; break;
            case 'A': number = 14; break;
            default:
                number =  Character.getNumericValue(c);
            break;
        }

        suit = stringcard.charAt(1);
        */

        this.number = number;
        this.suit = suit;



    }

    public int getNumber() {
        return number;
    }

    public char getSuit() {
        return suit;
    }

    public int compareTo(Card card) {
        int result = 0;
        if (this.getNumber() > card.getNumber()) result = 1;
        else if ( this.getNumber() < card.getNumber() ) result = -1;
        return result;
    }
}
