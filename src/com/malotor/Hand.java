package com.malotor;

import java.util.ArrayList;

/**
 * Created by manel on 09/02/15.
 */
public class Hand {
    protected ArrayList<Card> cards = new ArrayList<Card>();

    public Hand(String hand) {
        String[] cardStrings = hand.split(",");
        for(String cardString : cardStrings) {
            cards.add(new Card(cardString));
        }
    }

    public Card getHigherCard() {
        Card higherCart = cards.get(0);
        for (int i = 1; i < cards.size(); i++) {
            Card card = cards.get(i);
            if ( card.getNumber() > higherCart.getNumber() ) {
                higherCart = card;
            }
        }
        return higherCart;
    }
}
