package com.malotor;


public class PokerGame {

    public int resolve(String[] hands) {

        Card higherCart = new Card(hands[0]);
        int winner = 0;

        int player = 1;

        int numberOfplayers = hands.length;

        while( player < numberOfplayers ) {
            Card card = new Card(hands[player]);
            if ( card.getNumber() > higherCart.getNumber() ) {
                higherCart = card;
                winner = player;
            }
            player++;
        }
        return winner + 1;
    }


}
