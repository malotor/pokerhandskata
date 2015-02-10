package com.malotor;

public class Card implements Comparable<Card>{
    protected int number;
    protected char suit;

    public Card(int number , char suit) {
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
