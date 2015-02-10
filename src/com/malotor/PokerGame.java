package com.malotor;

import java.util.Arrays;
import java.util.ArrayList;
import com.malotor.Hand;

public class PokerGame {

    protected ArrayList<Hand> hands = new ArrayList<Hand>();
    protected int numberOfplayers;
    public PokerGame(String[] stringHands) {
        numberOfplayers = stringHands.length;
        for (int i = 0; i < numberOfplayers; i++) {
            Hand hand = HandFactory.create(stringHands[i]);
            hands.add(hand);
        }
    }

    public int getWinner() {

        int winner = 0;
        int player = 1;

        Card higherCart = getHand(0).getHigherCard();

        while( player < numberOfplayers ) {
            Card card = getHand(player).getHigherCard();
            if ( card.getNumber() > higherCart.getNumber() ) {
                higherCart = card;
                winner = player;
            }
            player++;
        }
        return winner + 1;
    }

    public Hand getHand(int player) {
        return hands.get(player);
    }

}
