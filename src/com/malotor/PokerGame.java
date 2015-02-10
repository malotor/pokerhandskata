package com.malotor;

import java.util.Arrays;
import java.util.ArrayList;
import com.malotor.Hand;

public class PokerGame {


    public int resolve(String[] stringHands) {

        ArrayList<Hand> hands = new ArrayList<Hand>();

        int winner = 0;
        int player = 1;

        for (int i = 0; i < stringHands.length; i++) {
            Hand hand = new Hand(stringHands[i]);
            hands.add(hand);
        }

        int numberOfplayers = hands.size();

        Card higherCart = hands.get(0).getHigherCard();

        while( player < numberOfplayers ) {
            Card card = hands.get(player).getHigherCard();
            if ( card.getNumber() > higherCart.getNumber() ) {
                higherCart = card;
                winner = player;
            }
            player++;
        }
        return winner + 1;
    }

}
