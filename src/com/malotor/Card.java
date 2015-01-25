package com.malotor;

public class Card {
    protected int number;
    protected char suit;

    public Card(String stringcard) {
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
    }

    public int getNumber() {
        return number;
    }

    public char getSuit() {
        return suit;
    }

}
