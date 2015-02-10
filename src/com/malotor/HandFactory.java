package com.malotor;

import java.util.ArrayList;

/**
 * Created by manel on 10/02/15.
 */
public class HandFactory {
    public static Hand create(String handString) {
        ArrayList<Card> cards = new ArrayList<Card>();

        String[] cardStrings = handString.split(",");
        for(String cardString : cardStrings) {
            cards.add(CardFactory.create(cardString));
        }

        return new Hand(cards);
    }
}
